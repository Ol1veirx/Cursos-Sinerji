import React, { useReducer } from 'react';
import './App.css';

const counterReducer = (state, action) => {
  switch (action.type) {
    case 'increment':
      return { count: state.count + 1 };
    case 'decrement':
      return { count: state.count - 1 };
    case 'reset':
      return { count: 0 };
    default:
      throw new Error(`Unknown action: ${action.type}`);
  }
};

export default function App() {
  const [state, dispatch] = useReducer(counterReducer, { count: 0 });

  const increment = () => {
    dispatch({ type: 'increment' });
  };

  const decrement = () => {
    dispatch({ type: 'decrement' });
  };

  const reset = () => {
    dispatch({ type: 'reset' });
  };

  return (
    <div className="container">
      <h2>Counter App</h2>
      <p className="counter">{state.count}</p>
      
      <div className="buttons">
        <button className="increment" onClick={increment}>
          Aumentar
        </button>
        <button className="decrement" onClick={decrement}>
          Diminuir
        </button>
        <button className="reset" onClick={reset}>
          Zerar
        </button>
      </div>
    </div>
  );
}
