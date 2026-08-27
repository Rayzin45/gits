   #                                                            Sistemas de Operação

   # Conceitos:

    Hardware

    Fornece recursos básicos de computação CPU, memória, dispositivos de E/S.

    Aplicativos

    Definem as maneiras como os recursos são usados, para resolver os problemas de computação dos usuários, como compiladores, banco de dados, jogos de videogames, programas comerciais e outros.

    Usuários

    São as pessoas, máquinas ou outros computadores.

    Sistema operacional

    Controla e coordena o uso do hardware entre os vários programas de aplicação, para os diversos usuários.

   # Sistemas operacionais de computadores de grande porte:

    Sistemas em lote:

    O sistema em lote (batch) processa tarefas de rotina sem a presença interativa do usuário. Por exemplo: processamento de apólices de companhia de seguro; relatório de vendas de uma cadeia de lojas.

    Sistemas de processamento de transações:

    Os sistemas de processamento de transações administram grandes quantidades de pequenas requisições. Cada unidade de trabalho é pequena, mas o sistema precisa tratar centenas ou milhares delas por segundo. 

    Por exemplo: processamento de verificações em um banco ou em reservas de passagens aéreas.

    Sistemas de tempo compartilhado:

    Os sistemas de tempo compartilhado permitem que múltiplos usuários remotos executem suas tarefas simultaneamente no computador. Por exemplo: realização de consultas a um banco de dados.

   # O sistema operacional funciona com algumas particularidades quanto à execução das rotinas:

    Tarefas não sequenciais, ou seja, as rotinas são executadas concorrentemente.
    
    Sem ordem predefinida.
    
    Eventos assíncronos.
    
    Eventos relacionados ao hardware e eventos relacionados às tarefas internas do próprio SO.

    Já o núcleo do SO deve atuar considerando essas particularidades, e para isso implementa funções como:

    Tratamento de interrupções e exceções.
    
    Criação e eliminação de processos e threads.
    
    Sincronização e comunicação entre processos e threads.
    
    Escalonamento e controle de processos e threads.
    
    Gerência de memória.
    
    Gerência do sistema de arquivos.
    
    Gerência dos dispositivos de E/S.
    
    Suporte a redes locais e distribuídas.
    
    Contabilização do uso do sistema.
    
    Auditoria e segurança do sistema.

   # Kernel e seus principais gerenciamentos:

    1. Gerenciamento de Processos

    O kernel é responsável por controlar a execução dos processos no sistema. Ele decide qual processo utilizará o processador e por quanto tempo, realizando o escalonamento de tarefas. Também cria, pausa, retoma e encerra processos, garantindo que vários programas possam funcionar ao mesmo tempo sem conflitos.

    2. Gerenciamento de Memória

    O kernel administra o uso da memória RAM do computador. Ele distribui a memória entre os programas em execução, evitando que um processo utilize o espaço de outro. Além disso, pode utilizar técnicas como memória virtual, que usa parte do disco para simular mais memória quando a RAM está cheia.

    3. Gerenciamento de Dispositivos

    O kernel controla a comunicação entre o sistema operacional e os dispositivos de hardware (teclado, mouse, disco, impressora, etc.). Isso é feito através de drivers, que permitem que o sistema entenda e utilize cada tipo de hardware corretamente.

    4. Gerenciamento de Arquivos

    O kernel também gerencia o sistema de arquivos, organizando como os dados são armazenados e acessados no disco. Ele controla a criação, leitura, escrita e exclusão de arquivos, além de gerenciar permissões e garantir a integridade dos dados.

   Modo Kernel e Modo Usuário
   
      Modo Kernel:
      O núcleo do sistema operacional, também conhecido como kernel, opera nesse modo. Ele tem acesso completo ao hardware e aos recursos do sistema.
      Modo Usuário
      
      Aplicações e programas que você usa normalmente funcionam nesse modo. Eles têm acesso limitado, sendo impedidos de acessar diretamente o hardware para evitar erros ou acesso indevido.
         
   Escalonamento de Processos e Threads
   
   Planejamento
      O sistema operacional decide qual processo deve ser executado em determinado momento, distribuindo o tempo de processamento entre os processos.
   Escalonamento
      O sistema determina a ordem de execução dos processos, priorizando processos importantes e garantindo que todos os processos tenham oportunidade de executar.
   Gerenciamento de Threads
      O sistema gerencia a execução de threads dentro de um processo, permitindo que um processo execute várias tarefas simultaneamente.

   Comunicação entre Processos e Sincronização
   Mensagens
      Processos podem se comunicar trocando mensagens, permitindo que eles compartilhern dados e coordenem suas ações.
   Sincronização
      O sistema fornece mecanismos para sincronizar o acesso a recursos compartilhados, evitando conflitos entre processos que acessam os mesmos dados.
   Semáforos
      Uma estrutura de dados que permite controlar o acesso a recursos compartilhados, garantindo que apenas um processo tenha acesso ao recurso por vez.
   Mutex
      Um mecanismo de exclusão mútua que permite que apenas um processo tenha acesso a um recurso compartilhado por vez, garantindo a integridade dos dados.

# Linux 
   As principais pastas do Linux e seus significados resumidos estão mostrados na tabela a seguir:

   /	Pasta Raiz	/usr	Programas de Usuário
   /bin	Executáveis Binários	/home	Pasta Pessoal
   /sbin	Sistema Binário	/boot	Arquivos de Inicialização
   /etc	Arquivos de Configuração	/lib	Bibliotecas do Sistema
   /dev	Arquivos de Dispositivos	/opt	Aplicações Opcionais
   /proc	Informação de Processo	/mnt	Pasta de Montagem
   /var	Arquivos Variáveis	/media	Dispositivos Removíveis
   /tmp	Arquivos Temporários	/srv	Serviço de Dados

   Comandos:https://stecine.azureedge.net/repositorio/00212ti/00596/docs/comandos.pdf