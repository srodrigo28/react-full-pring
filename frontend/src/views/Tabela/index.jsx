export function Tabela( {vetor} ) {
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
                        vetor.map((item, indice) => (
                            <tr key={indice}>
                                <td className="text-center">{item.codigo}</td>
                                <td>{item.nome}</td>
                                <td>{item.marca}</td>
                                <td>{item.preco}</td>
                                <td> <button className="btn btn-outline-success">Selecionar</button> </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    )
}