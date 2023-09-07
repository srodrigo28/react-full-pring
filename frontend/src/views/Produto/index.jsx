export function Produto( {botao, eventoTeclado, cadastrar} ) {
    return (
        <div>
            <h1>Produtos</h1>
            <form>
                <div className="row g-3 mb-3">
                    <div className="col-auto">
                        <input type="text" name="nome" onChange={eventoTeclado}  className="form-control" />
                    </div>
                    <div className="col-auto">
                        <input type="text" name="marca" onChange={eventoTeclado} className="form-control" />
                    </div>
                    <div className="col-auto">
                        <input type="text" name="preco" onChange={eventoTeclado} className="form-control" />
                    </div>
                </div>
                {
                    botao
                    ?
                        <div className="controle text-center">
                            <input type="button" value="Cadastrar" onClick={cadastrar} className="btn btn-outline-primary" />
                        </div>
                    : 
                    <div className="text-center d-flex justify-content-evenly mb-3 " >
                        <input type="button" value="Alterar" className="btn btn-outline-warning"  />
                        <input type="button" value="Remover" className="btn btn-outline-danger"   />
                        <input type="button" value="Cancelar" className="btn btn-outline-success" />
                    </div>
                }
            </form>
        </div>
    )
}