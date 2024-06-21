import './App.css';
import React from 'react';

// Não altere o nome do componente "App"
export default function App() {
    
    // useState é criado assim porque este exercício não suporta importação direta
    const useState = React.useState;
    
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [fullName, setFullName] = useState('');

    // Escreva a sua lógica dentro desta função
    function handleName (e) {
        e.preventDefault();
        
        if (!firstName || !lastName) {
            alert('Ambos os campos devem ser preenchidos');
        } else {
            setFullName(`${firstName} ${lastName}`);
        }
    }
    
    return (
        <>
            <div className="result">
                <h1>O nome completo é:</h1>
                {/* Mostre o nome completo dentro do <span> abaixo */}
                <span className="fullname">{fullName}</span>
            </div>
            
            <form onSubmit={handleName}>
                <label htmlFor="firstName">Nome</label>
                <input 
                    name="firstName" 
                    value={firstName} 
                    onChange={(e) => setFirstName(e.target.value)} 
                />
                <label htmlFor="lastName">Sobrenome</label>
                <input 
                    name="lastName" 
                    value={lastName} 
                    onChange={(e) => setLastName(e.target.value)} 
                />
                <button type="submit">
                Enviar
                </button>
            </form>
        </>
    )
}
