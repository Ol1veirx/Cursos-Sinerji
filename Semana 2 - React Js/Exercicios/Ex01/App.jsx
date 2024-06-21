import './App.css'

// Codigo da minha resolução do exercício

// Não mude o nome do componente "App"
export default function App() {
    
    // Não altere o conteúdo do array de filmes
    const movies = [
        {
            title: 'The Shawshank Redemption',
            year: 1994,
            rating: 4.7
        },
        {
            title: 'The Godfather',
            year: 1972,
            rating: 4.5
        },
        {
            title: 'The Lord of the Rings: The Fellowship of the Ring',
            year: 2001,
            rating: 4.4
        },
        {
            title: 'The Matrix',
            year: 1999,
            rating: 4.4
        },
    ];
    
    return (
    
        <>
            <table>
            
                {/* Este é o heading da tabela, não é preciso fazer nada aqui */}
                <thead>
                    <tr>
                        <th>Movie</th>
                        <th>Year</th>
                        <th>Rating</th>
                    </tr>
                </thead>
              
                <tbody>
                
                    {/* Mostre cada filme abaixo desta linha */} 
                    {/* Cada filme deve estar dentro do seu próprio elemento <tr> */} 
                    {movies.map(movie => (
                        <tr>
                            <td>{movie.title}</td>
                            <td>{movie.year}</td>
                            <td>{movie.rating}</td>
                        </tr>
                    ))}
                    
                    
                    {/*Fim da renderização da lista */}
                    
                </tbody> 
            </table>
        </>
    
    )
}
