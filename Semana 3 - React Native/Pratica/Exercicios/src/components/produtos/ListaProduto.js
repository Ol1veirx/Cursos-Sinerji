import React from 'react'
import { Text } from 'react-native'
import Estilo from '../estilo'

import produtos from './produtos'

// Método para obter a lista e retornar ela
export default props => {
    function obterLista() {
        return produtos.map(p => {
            return (
                <Text key={p.id}>
                    {p.id}) {p.nome} tem preço R$ {p.preco}
                </Text>
            )
        })
    }

    return (
        <>
            <Text style={Estilo.txtG}>
                Lista de Produtos
            </Text>
            {obterLista()}
        </>
    )
}