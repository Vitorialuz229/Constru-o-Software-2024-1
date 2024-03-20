# REST API 

## Definição: 
 * API REST significa Representational State Transfer.
 * É uma interface de programação de aplicações.
 * Conforme os princípios do estilo arquitetural REST.
 * Permite interação entre sistemas distribuídos.
 * Utiliza solicitações HTTP para comunicação.
 * Baseia-se nas restrições e diretrizes de Roy Fielding.
 * Inclui arquitetura cliente/servidor, stateless, cache, interface uniforme, sistema em camadas e opcionalmente código sob demanda.
* Facilita a comunicação eficiente, escalável e flexível entre componentes de software.

--- 

## O que são APIs e sua função: 
 * API significa Application Programming Interface, ou interface de programação de aplicações. 
 * Conjunto de definições e protocolos para integração e desenvolvimento de aplicações. 
 * Funciona como um contrato entre provedor e usuário, estabelecendo conteúdos exigidos pela chamada e pela resposta. 

--- 

## Papel das APIs: 
 * Mediador entre usuários/clientes e recursos/serviços web.
 * Facilita o compartilhamento de recursos e informações. 
 * Mantém segurança, controle e autenticação.

--- 

## O que é uma API de REST?
 * APIs são conjuntos de definições e protocolos para integração e desenvolvimento de aplicações.
 * É um conjunto de regras para a comunicação entre aplicativos ou dispositivos.
 * Baseia-se nos princípios do REST (Representational State Transfer).
 * Flexível e amplamente utilizada em arquiteturas de microsserviços.

--- 

## O que é REST?
 * REST ou Representational State Transfer, é um `modelo de arquitetura para a criação de web services` que se diferencia do modelo tradicional (como SOAP) pela utilização semântica dos métodos HTTP e pela simplicidade.
 * Não é um protocolo, mas sim um conjunto de diretrizes. 

--- 

## Princípios da arquitetura REST:
 * Arquitetura cliente/servidor com `comunicação via HTTP`.
 * Comunicação stateless entre cliente e servidor, sem armazenamento de informações do cliente.
 * Uso de cache para otimização de interações.
 * Interface uniforme entre componentes para transferência de informações em formato padronizado.
   -  Identificação e separação de recursos solicitados e suas representações.
   -  Manipulação de recursos pelo cliente através das representações recebidas. 
   -  Mensagens autodescritivas para descrição de processamento.
   -  Disponibilidade de hipertexto e hipermídia para navegação entre recursos.
 * Sistema em camadas para organização de servidores envolvidos.
 * Possibilidade de código sob demanda (opcional) para ampliar funcionalidades no cliente.

--- 

## Vantagens da arquitetura REST:
 * Mais fácil de usar do que protocolos prescritos como SOAP.
 * Mais rápida, leve e escalável, adequada para IoT e desenvolvimento de aplicativos móveis.

--- 

## Principais características de uma requisição REST:
 * `Utilização de métodos HTTP:` As operações são mapeadas para os métodos HTTP padrão, como GET, POST, PUT e DELETE, para buscar, criar, atualizar e excluir recursos, respectivamente.

 * `Recursos e URIs:` Os recursos são representados por URIs (Uniform Resource Identifiers) que identificam de forma única cada recurso na API. Por exemplo, `/users` pode representar a coleção de usuários, e /`users/123` pode representar um usuário específico com o ID 123.

 * `Estado de representação:` Os recursos são representados em um estado específico por meio de formatos de dados como JSON, XML, ou outros formatos acordados entre o cliente e o servidor.

 * `Sem estado (stateless):` As requisições para a API são independentes umas das outras, ou seja, cada requisição contém todas as informações necessárias para ser processada sem depender do estado anterior. Isso simplifica o gerenciamento do servidor e a escalabilidade da API.

 * `Interface uniforme:` A API segue uma interface uniforme baseada nos princípios REST, incluindo a utilização de métodos padronizados, URIs para identificar recursos e representação de recursos em formato acordado.

 * `Transferência de dados leve:` Os dados transferidos entre o cliente e o servidor são leves, geralmente utilizando formatos como JSON (JavaScript Object Notation) ou XML (eXtensible Markup Language), facilitando a transmissão e interpretação dos dados.

 * `HATEOAS (Hypermedia As The Engine Of Application State):` Esse princípio da arquitetura REST sugere que a API forneça links hipermídia nos recursos retornados, permitindo que o cliente navegue pela API de forma dinâmica e descubra novos recursos e operações disponíveis.

 * `Segurança:` A API REST pode implementar diferentes mecanismos de segurança, como autenticação (por exemplo, OAuth) e autorização, para garantir que apenas usuários autorizados acessem e manipulem os recursos de forma adequada.

