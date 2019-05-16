# Galadriel

Projeto referente a disciplina de Progrmação II, do 4º periodo do curso Análise e Desenvolvimento de Sistemas da Universidade Estácio de Sá; orientado pelo o professor André Luíz Braga.

## SISTEMA ZOID

#### Descrição 

Este sistema, será composto de vários módulos que terá por finalidade a assistência e manipulação de jogos de RPG (Role Playing Games).  Os módulos serão desenvolvidos por times separados mantendo a integração através dos paradigmas de polimorfismo e herança.

> O sistema “Zoid” é composto dos seguintes módulos e funcionalidades

1.	Gerencia Geral do Sistema.

2.	Controle de Avatares(Femininos e Masculinos).

3.	Controle de Combates/Encontros entre Avatares.

4.	Estórias que darão contexto ao jogo.

5.	Grupos de Avatares.

6.	Itens, como Ferramentas, Armas, etc.

7.	Controle dos Jogos e Partidas.

8.	Mapas e Localização de Avatares.

9.	Missões.

10.	Animais de Estimação.


> Cada um desses subsistemas tem vários outros conjuntos de manipulação.


### MODULO GALADRIEL - Construção de Avatares Femininos

Este módulo irá somente criar “Modelos” de avatares que serão futuramente configurados por jogadores. 
Você deve colocar atributos disponíveis a serem preenchidos depois pelo jogador, como por exemplo, “Estória de vida”, filhos e etc... 
e outras coisas que você achar que o jogador deverar preencher especificamente para o seu personagem. 

##### O projeto deverá se limitar a itens que façam sentido a categoria de Avatares Femininos.

 1.	Criar uma interface visual para construção destes avatares, entrando com as informações básicas dos avatares assim como as informações extras referentes a Avatares deste tipo.
 
 2.	Criar novas classes de avatares deste tipo, por herança e que já tenham alguns dos parâmetros preenchidos no construtor, por exemplo, uma Elfa poderia já ter uma quantidade de pontos de Força e Magia pré-estabelecidos.
 
 3.	Novos atributos específicos que pertençam a todos os objetos dessa categoria podem e devem ser acrescentados na classe abstrata.
 
 4.	Preencha os métodos de escrita e leitura dos dados em arquivo, ou banco de dados criando os métodos apropriados, porem sendo arquivo, assumindo que todas as informações serão escritas em uma só linha separada por vírgulas.
 
 5.	Ao terminar a criação, o Avatar deverá ser inserido na “Fabrica de Avatares” na seção de avatares “Disponíveis” para os jogadores e chamar os métodos de “Salvar” para guardar os avatares.  Assuma a Fábrica de Avatares já feita por outro grupo.

### Requisitos do Projeto

##### Classes Obrigratorias

    public abstract class Avatar { }
    
    public abstract class FabricaAvatar { }
    
    public class FabricaAvatarArquivo/FabricaAvatarBanco extends FabricaAvatar { }

##### Classes com Modificações Aditivas (Somente adicionar atributos, métodos ou código)

    public abstract class AvatarFeminino extends Avatar { }

## Autores

- Camila Romualdo

- Max Caldas

## Lincença


## Agradecimentos

- André Luiz Braga 

- Nathalia Mello
