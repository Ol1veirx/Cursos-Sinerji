import { createContext, useContext, useEffect, useReducer, useState } from "react";
export const TodosContext = createContext();

const initialTodos = localStorage.getItem('todos') ? JSON.parse(localStorage.getItem('todos')) : [];

export function TodosProvider({children}) {

    const [todos, dispatch] = useReducer(todosReducer, initialTodos);
    const [modalIsActive, setModalIsActive] = useState(false);
    const [filterBy, setFilterBy] = useState('');

    function filteredTodos() {
        switch(filterBy) {
            case 'todo':
                return todo.filter(todo => !todo.isDone)
            case 'done':
                return todo.filter(todo => todo.isDone)
            default:
                return todos
        }
    }

    useEffect(() => {
        localStorage.setItem('todos', JSON.stringify(todos))
    }, [todos]);

  return (
    <>
      <main>
        <TodosContext.Provider 
        value={
            {
                todos, 
                dispatch,
                modalIsActive,
                setModalIsActive,
                filterBy,
                setFilterBy,
                filteredTodos
            }}>
            {children}
        </TodosContext.Provider>
        

      </main>
    </>
  )
}

export function useTodos() {
    return useContext(TodosContext)
}

function todosReducer(todos, action) {
    if(action.type === 'deleted') {
        switch(action.type) {
            case 'deleted': {
                if(confirm('Are you sure you want to delete the to-do?')){
                    return todos.filter(todo => todo.id !== action.id)
                } else {
                    return todos;
                }
            }

            case 'added': {
                let newTodo = action.newTodo;
                newTodo.id = todos.length ? Math.max(...newTodo.id = todos.map(todo => todo.id)) + 1 : 1;
                return [...todos, newTodo]
            }

            case 'toggledIsDone': {
                return (todos.map(todo => {
                    if(todo.id === action.id) {
                        todo.isDone = !todo.isDone;
                        return todo;
                    } else {
                        return todo;
                    }
                }))
            }
        }
        
    }
}

