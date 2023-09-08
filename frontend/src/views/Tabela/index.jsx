export function Tabela( {vetor, selecionar} ) {
    return (
        <div className="container-scroll">
            <h1>Lista de Produtos</h1>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Marca</th>
                        <th>Preço</th>
                        <th>Selecionar</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        vetor.map((obj, indice) => (
                            <tr key={indice}>
                                <td className="text-center">{indice+1}</td>
                                <td>{obj.nome}</td>
                                <td>{obj.marca}</td>
                                <td>{obj.preco}</td>
                                <td> <button onClick={ () => {selecionar(indice)} } className="btn btn-outline-success">Selecionar</button> </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    )
}