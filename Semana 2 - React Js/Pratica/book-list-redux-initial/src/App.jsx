import { BrowserRouter, Routes, Route } from 'react-router-dom';
import BooksPage from './views/BooksPage.jsx';
import SingleBookPage from './views/SingleBookPage.jsx';
import AddBookPage from './views/AddBookPage.jsx';

function App() {

  return (
    <>
      <BrowserRouter>
      <Routes>
        <Route index element={<BooksPage></BooksPage>}></Route>
        <Route path='add-book' element={<AddBookPage></AddBookPage>}></Route>
        <Route path='book/:id' element={<SingleBookPage></SingleBookPage>}></Route>
      </Routes>
      </BrowserRouter>
        
    </>
  )
}

export default App
