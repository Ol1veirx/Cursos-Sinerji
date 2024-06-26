import './App.css'

// Não altere o nome do componente "App"
export default function App() {
    
    {/* Não altere o conteúdo do array de products */}
    const products = [
        {
            name: 'Backpack, Fits 2 Laptops',
            price: 109,
            discountedPrice: 94,
            image: 'https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg'
        },
        {
            name: 'Mens Casual Premium Slim Fit T-Shirts',
            price: 22,
            discountedPrice: null,
            image: 'https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg'
        },
        {
            name: 'Womens Legends Chain Bracelet',
            price: 695,
            discountedPrice: 499,
            image: 'https://fakestoreapi.com/img/71pWzhdJNwL._AC_UL640_QL65_ML3_.jpg'
        },
        {
            name: 'Rain Jacket Women Windbreaker',
            price: 39,
            discountedPrice: null,
            image: 'https://fakestoreapi.com/img/71HblAHs5xL._AC_UY879_-2.jpg'
        },
        {
            name: 'WD 4TB Gaming Drive',
            price: 114,
            discountedPrice: null,
            image: 'https://fakestoreapi.com/img/61mtL65D4cL._AC_SX679_.jpg'
        },
        {
            name: 'Samsung 49-Inch CHG90 Monitor',
            price: 890,
            discountedPrice: 819,
            image: 'https://fakestoreapi.com/img/81Zt42ioCgL._AC_SX679_.jpg'
        }
    ];
    
    return (
    
        <>
            <h2>List Of Products</h2>
            <div className="products">
            
                {/* Faça o trabalho necessário abaixo desta linha */}
                
                {products.map(product => (
                    <div key={product.name} className="product">
                        <img src={product.image} />
                        <div className="info">
                            <p>{product.name}</p>
                            {product.discountedPrice ? (
                                <>
                                    <h4 className="crossed">$ {product.price}</h4>
                                    <h4>$ {product.discountedPrice}</h4>
                                </>
                            ) : (
                                <h4>$ {product.price}</h4>
                            )}
                        </div>
                    </div>
                ))}
                
                {/* O trabalho termina aqui */}
                
            </div>
        </>
    
    )
}
