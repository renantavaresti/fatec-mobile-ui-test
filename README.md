# Fatec Testes Mobile com Appium

Este projeto tem como objetivo juntar os componentes, ferramentas e as configurações necessárias para execução de testes automatizados utilizando o appium.


## Para instalar 

Para conseguir executar este projeto é necessário que os seguintes componentes estejam instalados na sua máquina.

* [Java](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html) 
* [Node](https://nodejs.org/en/download/)
* [Appium ou Appium Desktop](https://github.com/appium/appium-desktop/releases/tag/v1.18.3)
* [Maven](https://maven.apache.org/install.html)
* [Android SDK ou Android Studio](https://developer.android.com/studio?hl=pt-br)
* [Xcode](https://developer.apple.com/xcode/)

## Configuração

Após realizar a instalação dos componentes acima é necessário realizar a configuração das variáveis de ambiente para que o appium consiga se comunicar com os dispositivos.

### Setar $JAVA_HOME e $ANDROID_HOME

Os tutoriais abaixo mostram de forma objetiva a configuração das variáveis de ambiente para java home e android home.

| SO        | Java Home           | Android Home  |
| ------------- |:-------------:| :-----:|
| Mac     | [Tutorial para Mac](https://www.mkyong.com/java/how-to-set-java_home-environment-variable-on-mac-os-x/) | [Tutorial para Mac](http://automate-apps.com/set-android_home-environment-variable-in-mac-os/) |
| Ubuntu      | [Tutorial para Ubuntu](https://vitux.com/how-to-setup-java_home-path-in-ubuntu/)      |   [Tutorial para Ubuntu](https://www.itsolutionstuff.com/post/how-to-set-android-home-environment-variable-in-ubuntuexample.html) |

> Nota : Se possui windows como SO recomendo seguir o tutorial a seguir : [Configurando variaveis de ambiente do appium no Windows.](http://www.taketest.com.br/2016/01/19/tutorial-instalacao-do-appium-no-windows-parte-1/)

## Verificando as dependências com appium-doctor.

Para validar se todas as configurações acima foram feitas corretamente você pode utilizar o appium-doctor.

Para realizar a instalação basta realizar a instalação com npm

```

$ npm install -g appium-doctor

```

Para validar as dependências.

```

$ appium-doctor

```

# Executando os testes via maven.

Antes de mais nada é necessário subir o appium.

```

$ appium

```

Após verificar que o appium está de pé só executar os testes rodando o comando abaixo.

```

$ mvn clean test

```


# Desafio

Este código está ok, mas existe uma forma dele ficar melhor ainda, com algumas parametrizações...

Iai será que você consegue simplificar esse código para que possua apenas um teste para as duas plataformas ?

![Alt Text](https://media.giphy.com/media/3WPKHcTih1xwQ/giphy.gif)


# Documentações

* [Appium](http://appium.io/docs/en/about-appium/intro/)
* [Java Client](https://github.com/appium/java-client)
* [Junit 5](https://junit.org/junit5/docs/current/user-guide/)

