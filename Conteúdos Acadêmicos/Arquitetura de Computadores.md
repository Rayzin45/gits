# Gerações Computacionais

        Primeira geração: vávulas termiônicas

        Ainda durante a Segunda Guerra Mundial, nos Estados Unidos, foi desenvolvido o primeiro computador eletrônico da história. Trata-se do ENIAC, um computador integrador numérico eletrônico, cujos números impressionam. Veja a seguir uma foto deste modelo:
        
        Componentes: 170.000 válvulas termiônicas.
        Peso: cerca de 30 toneladas.
        Espaço utilizado: Sala de 150 m².
        Capacidade de processamento (número de cálculos por segundo): 1 bilhão de vezes menor que a dos celulares usados hoje em dia.

        Para evoluirmos desse verdadeiro elefante para os computadores atuais, foi preciso substituir as válvulas, já que elas eram pesadas e espaçosas.

        Mas o que permitiu a evolução dos enormes computadores de válvulas para os modelos atuais?

        Segunda geração: transistores

        O transistor possibilitou a evolução dos computadores e deu início à era da microeletrônica. Com ele, surgia a segunda geração de computadores, marcada pela substituição das válvulas e pela redução significativa de tamanho, consumo de energia e custo.

        Os primeiros transistores ocupavam apenas alguns milímetros, precisando de bem menos energia que as válvulas. Assim, foi possível reduzir o tamanho de rádios, equipamentos eletrônicos, em geral, e computadores.

        Terceira geração: circuitos integrados

        Na década de 1960, o próximo salto de evolução foi dado com a criação dos circuitos integrados (CI): pastilhas de silício que contêm um circuito eletrônico miniaturizado. É o que, de forma comum, chamamos de chip de computador.

        Com o uso de transistores e CI, os computadores ficaram menores e cada vez mais baratos.

        Em meados da década de 1970, houve a eclosão dos computadores pessoais, denominados PCs (personal computers).

        Duas gigantes da tecnologia foram fundadas na década de 1970.

        Microsoft Corporation

        Empresa americana fundada em 1975 por Bill Gates e Paul Allen. É a maior em faturamento no setor de programas de computador, conhecida pelo sistema operacional Windows e pelo pacote de produtividade Office.

        Apple Inc.

        Em 1976, a empresa vendeu 200 unidades do Apple I, seu primeiro computador pessoal. No ano seguinte, o Apple II alcançou vendas de milhares de unidades, e a companhia abriu seu capital na Bolsa de Nova York.

        Quarta geração: microprocessadores

        A década de 1980 presenciou a proliferação de PCs cada vez mais potentes, baratos e conectados por meio do surgimento das redes locais de computadores e da internet: a rede mundial.

        Além disso, um novo aparelho chegava aos lares: o videogame, um tipo de computador especializado, com programas em forma de jogos eletrônicos que destacam gráficos e interação com os usuários.


# Base computacional

   -  engloba os princípios estruturais e lógicos que viabilizam o funcionamento dos sistemas informáticos. Este estudo abrange desde a evolução histórica das arquiteturas de hardware até a representação binária de dados, passando pela lógica digital, pelo papel essencial dos sistemas operacionais e pela interconexão de dispositivos em redes de comunicação  
        
  > CISC (Complex Instruction Set Computer) e RISC (Reduced Instruction Set Computer).   

      -  Arquitetura CISC
        Foco no hardware. Instruções complexas e de tamanho variável. Menor quantidade de código gerado, mas exige múltiplos ciclos de clock por instrução.      
      
      -  Arquitetura RISC
        Foco no software. Instruções simples e de tamanho fixo. Maior quantidade de código gerado, com execução otimizada em um único ciclo de clock.  

      - pipeline de execução é uma técnica que divide uma tarefa grande em etapas menores e sequenciais

      - coerência de cache garante que todos os núcleos de um processador vejam a mesma versão dos dados na memória

      - paginação de memória é uma técnica de gerenciamento de dados usada por sistemas operacionais para dividir a memória física em blocos fixos chamados frames e a memória lógica em blocos de igual tamanho chamados páginas. Ela elimina a necessidade de alocação contígua e reduz a fragmentação  

      - Arquitetura Harvard é um modelo de projeto de computadores que usa memórias físicas e barramentos separados para dados e instruções

      
# Base binária e a quantificação da informação 

        dígito binário é denominado bit (binary digit) e representa a menor unidade de informação em um sistema digital. O estado de alta tensão é associado ao valor lógico 1, enquanto o estado de baixa tensão (ou ausência de tensão) é associado ao valor lógico 0. Isolado, um bit carrega pouca informação. No entanto, ao agrupar múltiplos bits, a capacidade de representação cresce de forma exponencial.

        O agrupamento padrão adotado na computação é o byte, composto por 8 bits. Com um byte, é possível representar $2^8$ combinações distintas, totalizando 256 valores diferentes (de 0 a 255 no sistema decimal). A partir do byte, derivam-se os múltiplos utilizados para medir a capacidade de armazenamento e processamento, como o Kilobyte (KB), Megabyte (MB), Gigabyte (GB) e Terabyte (TB), seguindo potências de base 2.

        Considere a conversão do número decimal 13 para binário:

                , com resto 1.
                , com resto 0.
                , com resto 1.
                , com resto 1.
                Lendo os restos de baixo para cima, obtemos o valor binário 
                .

                Para realizar a operação inversa, convertendo de binário para decimal, utiliza-se a soma dos produtos de cada dígito pelo peso de sua posição. A posição mais à direita possui índice 0, e o índice aumenta da direita para a esquerda. O peso é calculado elevando a base (2) ao índice da posição.

                Para o número binário 
                :

                Além das bases binária e decimal, o sistema hexadecimal (base 16) é amplamente utilizado na computação. O sistema hexadecimal emprega os dígitos de 0 a 9 e as letras de A a F (representando os valores de 10 a 15). A principal vantagem do sistema hexadecimal é a sua capacidade de representar agrupamentos de 4 bits (um nibble) com um único caractere. Isso simplifica a leitura de grandes sequências binárias, sendo o padrão para a notação de endereços de memória, códigos de cores em design e endereços físicos de rede (MAC address).

        O padrão ASCII (American Standard Code for Information Interchange) foi uma das primeiras codificações amplamente adotadas. O ASCII original utiliza 7 bits para representar 128 caracteres, incluindo o alfabeto inglês em maiúsculas e minúsculas, dígitos de 0 a 9 e caracteres de controle, como retorno de carro e quebra de linha. O uso de 7 bits permitia que o oitavo bit de um byte fosse utilizado para verificação de paridade, um método simples de detecção de erros na transmissão de dados.

        Com a expansão global da informática, o padrão ASCII revelou-se insuficiente, pois não contemplava caracteres acentuados, alfabetos não latinos (como cirílico, grego e árabe) ou ideogramas asiáticos. Para solucionar essa limitação, foram criadas extensões do ASCII utilizando o byte completo (8 bits), permitindo 256 caracteres, mas ainda assim insuficientes para a diversidade linguística mundial.

        O padrão Unicode. O objetivo do Unicode é fornecer um número único para cada caractere, independentemente da plataforma, do programa ou do idioma. Em suas versões mais recentes, o Unicode possui capacidade para representar mais de um milhão de caracteres distintos, abrangendo todas as línguas escritas conhecidas, além de símbolos matemáticos, notações musicais e emojis.

        A implementação mais comum do Unicode é o UTF-8 (Unicode Transformation Format - 8-bit). O UTF-8 utiliza um esquema de codificação de tamanho variável, onde caracteres comuns do alfabeto inglês ocupam apenas 1 byte (mantendo compatibilidade retroativa com o ASCII original), enquanto caracteres acentuados ou símbolos complexos podem ocupar de 2 a 4 bytes. Essa eficiência de armazenamento tornou o UTF-8 o padrão dominante na internet e nos sistemas operacionais modernos.

        O processo de codificação estende-se também a imagens e sons. Uma imagem digital é dividida em uma grade de pequenos quadrados chamados pixels. Em uma imagem colorida, a cor de cada pixel é representada por uma combinação de valores numéricos para as intensidades de vermelho, verde e azul (sistema RGB). O som, por sua vez, é uma onda analógica contínua que é convertida em formato digital por meio de amostragem, onde a amplitude da onda é medida e registrada em intervalos regulares, gerando uma sequência de valores binários.

>    Lógica digital e circuitos booleanos   

        Álgebra de Boole e portas lógicas
        O processamento de informações binárias no nível do hardware baseia-se na álgebra de Boole, um ramo da matemática desenvolvido por George Boole no século XIX. A álgebra booleana lida com variáveis que assumem apenas dois valores: verdadeiro (1) ou falso (0). As operações fundamentais dessa álgebra são a conjunção (AND), a disjunção (OR) e a negação (NOT).

        Na arquitetura de computadores, essas operações lógicas são implementadas fisicamente por meio de circuitos eletrônicos denominados portas lógicas. As portas lógicas são construídas a partir de arranjos de transistores e recebem um ou mais sinais de entrada, produzindo um único sinal de saída de acordo com a operação booleana que representam.

        A porta lógica AND produz uma saída verdadeira (1) apenas se todas as suas entradas forem verdadeiras. Se qualquer entrada for falsa (0), a saída será falsa. A porta OR produz uma saída verdadeira se pelo menos uma de suas entradas for verdadeira. A porta NOT, também chamada de inversor, recebe apenas uma entrada e inverte o seu valor lógico; se a entrada for 1, a saída será 0, e vice-versa.

        Porta AND
        Operação: Conjunção Lógica. Regra: A saída é 1 se e somente se todas as entradas forem 
        Porta OR
        Operação: Disjunção Lógica. Regra: A saída é 1 se pelo menos uma das entradas for 1. Expressão: 
        Porta NOT
        Operação: Negação Lógica. Regra: Inverte o estado da entrada. 
        

        A partir dessas três portas fundamentais, é possível construir operações derivadas, como NAND (NOT AND), NOR (NOT OR) e XOR (Exclusive OR). As portas NAND e NOR possuem uma propriedade especial na engenharia de hardware: elas são consideradas "portas universais". Isso significa que qualquer circuito lógico, por mais complexo que seja, pode ser construído utilizando apenas portas NAND ou apenas portas NOR. Essa característica simplifica o processo de fabricação de circuitos integrados, permitindo a padronização dos componentes na pastilha de silício.

>     Circuitos combinacionais e sequenciais          

        circuitos combinacionais incluem os somadores, que realizam a adição de números binários na ULA; os multiplexadores, que selecionam uma entre várias linhas de entrada e a direcionam para uma única linha de saída; e os decodificadores, que convertem um código binário de entrada em uma ativação de linha de saída específica, sendo vitais para a seleção de endereços de memória.

        Por outro lado, os circuitos sequenciais possuem a capacidade de armazenar estados. Nesses circuitos, a saída depende não apenas das entradas atuais, mas também do histórico de entradas anteriores. Essa capacidade de memorização é obtida por meio de laços de realimentação (feedback), onde a saída de uma porta lógica é conectada de volta à entrada de uma porta anterior.

        O elemento básico de memória em um circuito sequencial é o flip-flop, capaz de armazenar um único bit de informação. O agrupamento de flip-flops forma os registradores da CPU e as células de memória estática (SRAM) utilizadas nas memórias cache. A sincronização das operações em circuitos sequenciais é coordenada por um sinal de clock, que emite pulsos elétricos em intervalos regulares, garantindo que as mudanças de estado ocorram de maneira ordenada e previsível.

>     A hierarquia de memória e o desempenho do sistema    
        
        arquitetura de computadores adota o conceito de hierarquia de memória. A hierarquia organiza diferentes tipos de armazenamento em níveis, baseando-se no princípio da localidade de referência. Esse princípio afirma que os programas tendem a acessar uma porção restrita da memória em um dado período, seja repetindo instruções em um laço de repetição (localidade temporal) ou acessando dados armazenados em endereços contíguos, como em um vetor (localidade espacial).

        No topo da hierarquia, encontram-se os registradores, localizados dentro da CPU. Eles operam na mesma velocidade do processador, mas possuem capacidade extremamente limitada, armazenando apenas os dados em uso no momento exato. Logo abaixo, está a memória cache, construída com tecnologia SRAM. A cache atua como um intermediário de alta velocidade entre a CPU e a memória principal, armazenando cópias dos dados e instruções acessados com maior frequência.

>     Níveis de cache e memória principal

        A memória cache é dividida em múltiplos níveis (L1, L2, L3) para equilibrar custo, capacidade e velocidade. A cache L1 é a menor e mais rápida, integrada diretamente no núcleo do processador. A cache L2 possui maior capacidade, porém é ligeiramente mais lenta, podendo ser dedicada a cada núcleo ou compartilhada. A cache L3 é ainda maior e, em geral, compartilhada entre todos os núcleos de um processador multicore. Quando a CPU precisa de um dado, ela busca primeiro na L1; se não encontrar (cache miss), busca na L2, depois na L3 e, por fim, na memória principal.

        A memória principal, ou RAM (Random Access Memory), ocupa o nível intermediário da hierarquia. Construída com tecnologia DRAM (Dynamic RAM), ela oferece alta capacidade de armazenamento a um custo acessível, mas sua velocidade de acesso é inferior à da cache. A memória RAM é volátil, o que significa que perde todas as informações armazenadas quando o fornecimento de energia é interrompido. Ela abriga o sistema operacional, os programas em execução e os dados com os quais o usuário está trabalhando no momento.

# Arquiteturas de rede e o modelo OSI

 - As sete camadas, da base para o topo, são: Física, Enlace de Dados, Rede, Transporte, Sessão, Apresentação e Aplicação.

 - A Camada Física lida com a transmissão dos bits brutos pelo meio de comunicação, definindo tensões elétricas, pinagens de conectores e modulação de sinais. A Camada de Enlace de Dados organiza os bits em quadros (frames), detecta erros físicos e gerencia o acesso ao meio compartilhado, utilizando endereços físicos (MAC). A Camada de Rede é responsável pelo roteamento dos pacotes através de múltiplas redes interconectadas, determinando o melhor caminho da origem ao destino com base em endereços lógicos (IP).

> Camada de Rede (OSI)
        
        Responsável pelo roteamento e endereçamento lógico. Define o melhor caminho para os pacotes viajarem através de múltiplas redes interconectadas.

> Camada de Transporte (OSI)
        
        Garante a entrega de ponta a ponta. Segmenta os dados, controla o fluxo e pode fornecer mecanismos de recuperação de erros (como no TCP).

> Camada de Aplicação (OSI)
        
        Interface direta com o usuário e os programas. Fornece serviços de rede como navegação web, e-mail e transferência de arquivos.

> arquitetura TCP/IP
  
 - Embora o modelo OSI seja o padrão teórico de referência para o estudo de redes, a arquitetura que de fato impulsionou a internet e domina as comunicações globais é o modelo TCP/IP (Transmission Control Protocol / Internet Protocol). O TCP/IP é um modelo mais pragmático, consolidado em quatro camadas: Acesso à Rede, Internet, Transporte e Aplicação.

 - A camada de Internet do TCP/IP é dominada pelo protocolo IP, que fornece um serviço de entrega de pacotes não confiável e sem conexão. O IP adiciona um cabeçalho aos dados contendo os endereços de origem e destino, mas não garante que o pacote chegará, nem que chegará na ordem correta. A responsabilidade pela confiabilidade é transferida para a camada superior.

 - Na camada de Transporte, o protocolo TCP atua para garantir a integridade da comunicação. Ele estabelece uma conexão lógica entre a origem e o destino, numera os segmentos de dados, solicita confirmações de recebimento (ACKs) e retransmite segmentos perdidos. O TCP garante que os dados entregues à camada de aplicação estejam completos e na ordem correta, mascarando as imperfeições da rede física subjacente.

> Modelos de serviço em nuvem

       - A computação em nuvem é estruturada em três modelos de serviço principais. 
       
       - O primeiro é a Infraestrutura como Serviço (IaaS), onde o provedor de nuvem fornece recursos básicos de computação, como máquinas virtuais, armazenamento e redes virtuais. O cliente tem controle total sobre o sistema operacional e os aplicativos instalados, sendo responsável pela manutenção e segurança lógica do ambiente.

       - O segundo modelo é a Plataforma como Serviço (PaaS). Neste modelo, o provedor oferece um ambiente completo de desenvolvimento e implantação, abstraindo não apenas o hardware, mas também o sistema operacional, os servidores web e os sistemas de banco de dados. Os desenvolvedores podem focar de modo exclusivo na escrita do código de seus aplicativos, sem se preocupar com a configuração da infraestrutura subjacente.

       - O terceiro modelo é o Software como Serviço (SaaS). Aqui, o provedor entrega um aplicativo de software completo e funcional via internet. O cliente não gerencia a infraestrutura, a plataforma ou o código do aplicativo; ele apenas consome o serviço por meio de um navegador web. Exemplos comuns de SaaS incluem serviços de e-mail corporativo, sistemas de gestão empresarial (ERP) e plataformas de colaboração online.

# Componentes de Hardware

   > Arquitetura clássica de Von Neumann  

   - fundamenta-se em três pilares estruturais distintos, mas interdependentes: a Unidade Central de Processamento (UCP ou CPU), a Memória Principal e o Sistema de Entrada e Saída (E/S). A CPU atua como o cérebro do sistema, responsável por buscar, decodificar e executar as instruções. A Memória Principal funciona como um repositório temporário de acesso rápido, abrigando os dados brutos e o código binário do programa em execução. O Sistema de Entrada e Saída atua como a interface de comunicação com o mundo externo, permitindo a inserção de dados por meio de teclados ou sensores e a extração de resultados por meio de monitores ou atuadores mecânicos.

   > Interconexão de componentes e barramentos

   -  o barramento do sistema é subdividido em três categorias funcionais: o barramento de dados, o barramento de endereços e o barramento de controle 

   - Barramento de dados
        Via bidirecional que transporta os bits de informação reais entre os componentes. Sua largura em bits define a quantidade de dados transferidos por ciclo.
       
   - Barramento de endereços
        Via unidirecional que transporta a localização específica da memória ou do dispositivo de E/S que a CPU deseja acessar naquele momento.
        
   - Barramento de controle
        Conjunto de linhas que transmitem sinais de comando, como leitura, gravação e interrupções, coordenando as ações de todos os módulos do sistema.    