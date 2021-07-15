<h1 align = "center">
<a href="https://github.com/AucelioBarbosa/TesteSouthSystem"> Teste Automatizado Mobile</a>
</h1>

<h2 align = "center">
<p > Teste automatizado de aplicativo mobile validando as funcionalidades e usabilidade</p>
</h2>

Esse teste consiste em avaliar um aplicativo em desenvolvimento, para isso foi criado um cenário de testes funcionais onde é avaliado se suas
funcionalidades estão em perfeito estado de funcionamento.

Dado que um usuário baixe o app em seu dispositivo; <br>
E tente efetuar o login sem estar previamente cadastrado; <br>
Quando tentar efetuar o login sem o cadastro prévio; <br>
Então é mostrado a mensagem "Usuário ou senha inválidos".<br>
<p>
Dado que um usuário não tenha um cadastro realizado é permitido efetuar o cadastro pelo app; <br>
E ao click em cadastrar leve para um proxima activity; <br>
Então o usuário poderá realizar o cadastro.<br>
<p>
Dado que o usuário efetue seu cadastro; <br>
E tente informe sua senha; <br>
E ao confirmar a senha informada; <br>
Quando clicar no botão de cadastro valide sua senha; <br>
Então se os dados não estiverem de acordo a mensagem "Senhas não conferem".<br>
<p>
Dado que o usuário efetue seu cadastro; <br>
E tente informe sua senha; <br>
E ao confirmar a senha informada; <br>
Quando clicar no botão de cadastro; <br>
Então então o usuário é cadastrado".<br>
<p>
Dado que o usuário já tenha realizado o cadastro prévio; <br>
E efetuar o login; <br>
Então  o mesmo será encaminhado para a activity de compras".<br>
<p>
Dado que o usuário estiver na activity de compras; <br>
E selecione um produto; <br>
E click no botão de pagamento; <br>
Então será direcionado a activity de pagamento.<br>
<p>
Dado que o usuário na activity de pagamento; <br>
E efetue o cadastro de seu cartão; <br>
E Quando clica no botão de pagamento; <br>
Então é mostrado a mensagem via toast "Falha ao criar pagamento".<br>
<p>
Dado que o usuário queira efetuar o logoff;<br>
E clicar no botão de logout;<br>
Então o usuário retornará a activity de login.<br>
  
  
<h2 align = "center">
  <p> Pré-requisitos</p>
</h2>
1 - IDE IntelliJ;<br>
2 - AVDManager;<br>
3 - Appium configurado em seu computador e instalado;<br>
4 - Fazer o fork do apk do <a href="https://github.com/rh-southsystem/desafio-appium-south"> desafio;</a><br>
5 - Baixar um emulado com a versão 9.0;<br>
6 - Conferir se o pom.xml está configurado corretamente;<br>
7 - Versão da JDK 1.8;<br>
<p>
<h2 align = "center">  
  <p>Library Utilizadas</p>
</h2>

* JUnit 4.12;<br>
* Appium Client 7.5.1;<br>

