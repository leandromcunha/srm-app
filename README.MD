SRM - Teste Tecnico 

Projetos Back-End:
- srm-common: Parte comum utilizada nos projeto srm-credit-line e srm-risk.
	:Compilando:
		mvn clean install

- srm-credit-line: Projeto responsavel em adicionar na base de dados a linha de credito
	:Compilando:
		mvn clean install
	:Executando:
	  java -jar srm-credit-line-0.0.1-SNAPSHOT.jar
	  
	
- srm-risk: Projeto responsavel em retornar a lista de de risco com a sua respectiva taxa.
	:Compilando:
		mvn clean install
	:Executando: 
	  java -jar srm-risk-0.0.1-SNAPSHOT.jar
	  
Projeto Front-End

- srm-web: Projeto web desenvolvido em Angular 5

  Criando pacote de distribui�ao: ng build --prod
  Executando: copiar o conte�do da pasta dist para o Apache ou executar o comando http-server
  
Ferramentas utilizadas:
Java
Banco de dados: Posrgesql
Framework: SpringBoot
IDE: Eclipse - Java e VisualStudioCode - Angular e TypeScript
Browse: FireFox e Chrome

Passos de execu��o:

Como se trata de um teste, algumas processo precisam ser executado na sequencia, coisa que um ambiente de produ��o isso jamais acontecer�.

Executar os processo na sequinte order:

java -jar srm-risk-0.0.1-SNAPSHOT.jar

java -jar srm-credit-line-0.0.1-SNAPSHOT.jar

Dentro da pastas dist executar http-server, caso n�o tenha instaldo, execute antes "npm install http-server -g"

Configura do banco de dados: ver os arquivos application.properties dos projetos java