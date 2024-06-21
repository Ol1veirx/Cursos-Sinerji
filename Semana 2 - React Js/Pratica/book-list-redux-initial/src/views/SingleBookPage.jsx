import Notes from '../components/Notes.jsx'
import { useParams, Link, useNavigate } from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';
import { eraseBook, selectBooks, toggleRead } from '../store/booksSlice.js';
import { eraseBookNote } from '../store/notesSlice.js';

function SingleBookPage() {

  const dispatch = useDispatch();
  const navigate = useNavigate();

  function handleEraseBook(id) {
    if(confirm('Are you sure you want to erase this book and all notes? ')){
      dispatch(eraseBook(id))
      dispatch(eraseBookNote(id))
      navigate("/")
    }
  }

    const {id} = useParams();

    const books = useSelector(selectBooks);


    const book = books.filter(book => book.id == id)[0];
    
    return (
      <>
        <div className="container">
            <Link to="/">
             <button className="btn">
                    ← Back to Books
                </button>
            </Link>

            {book ?
              <div>
                <div className="single-book">
                      <div className="book-cover">
                          <img src={book.cover} />
                      </div>

                      <div className="book-details">
                          <h3 className="book-title">{ book.title }</h3>
                          <h4 className="book-author">{ book.author }</h4>
                          <p>{book.synopsis}</p>
                          <div className="read-checkbox">
                              <input onClick={dispatch(toggleRead(book.id))} type="checkbox" defaultChecked={book.isRead} />
                              <label>{ book.isRead ? "Already Read It" : "Haven't Read it yet" }</label>
                          </div>
                          <div onClick={() => handleEraseBook(book.id)} className="erase-book">
                              Erase book
                          </div>
                      </div>
                </div>

                <Notes bookId={id}/>
              </div>
          
             : 
             <div>
              <p>Book not found. Clicke the button go back</p>
             </div>
             }
            
               
            
            

        </div>

        
      </>
    )
  }
  
  export default SingleBookPage
  