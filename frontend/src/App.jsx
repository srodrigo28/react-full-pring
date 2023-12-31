import { useEffect, useState } from "react"
import { Produto } from "./views/Produto"
import { Tabela } from "./views/Tabela"

function App() {

  // Objeto produto
  const produto = {
    codigo: 0,
    nome: '',
    marca: '',
    preco: ''
  }

  const [btnCadastrar, setBtnCadastrar] = useState(true);
  const [produtos, setProdutos] = useState([])
  const [objProduto, setObjProduto] = useState(produto);

  useEffect(() => {
    fetch("http://localhost:8080/produto/listar")
      .then(retorno => retorno.json())
      .then(retorno_convertido => setProdutos(retorno_convertido));
  }, []);

    // Obter os dados do formulário
    const aoDigitar = (e) => {
      setObjProduto({ ...objProduto, [e.target.name]: e.target.value })
    }
    // Cadastrar produto
    const cadastrar = () => {
      fetch('http://localhost:8080/produto/cadastrar', {
        method: "POST",
        body: JSON.stringify(objProduto),
        headers: {
          'Content-type': 'application/json',
          'Accept': 'application/json'
        }
      })
        .then(retorno => retorno.json())
        .then(retorno_convertido => {
          //console.log(retorno_convertido)

          if (retorno_convertido.messagem !== undefined || null) {
            alert(retorno_convertido.messagem)
            return false;
          } else {
            setProdutos([...produtos, retorno_convertido]);
            alert('Cadastrado com suceso!')
            limparFormulario();
          }
        })
        // console.log(e.target);
    }
  
  // Limpar os campso
  const limparFormulario = () => {
    setObjProduto(produto);
  }

  // Selecionar produto
  const selecionarProduto = (indice) => {
    setObjProduto(produto[indice]);
    setBtnCadastrar(false);
  }
  
    return (
      <div className="container mt-3">
        {/* <p> { JSON.stringify(produtos) } </p> */}
        {/* <p> {JSON.stringify(objProduto)} </p> */}
        <Produto
          botao={btnCadastrar}
          eventoTeclado={aoDigitar}
          cadastrar={cadastrar}
          obj={objProduto}
        />
        <Tabela
          vetor={produtos}
          selecionar={selecionarProduto}
        />
      </div>
    );
  }


export default App
