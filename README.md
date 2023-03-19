<!-- PROJECT LOGO -->
<a name="readme-top"></a>
<div align="center">
    <h3 align="center">qa_java</h3>
    <a href="http://site.mockito.org">
<img src="https://raw.githubusercontent.com/mockito/mockito/master/src/javadoc/org/mockito/logo.png"
     srcset="https://raw.githubusercontent.com/mockito/mockito/master/src/javadoc/org/mockito/logo@2x.png 2x"
     alt="Mockito" />
    </a>
    <p align="center">
        Учебный проект по unit-testing и практика использования библиотек Mockito и JaCoCo.
        <br/>
        <br/>
    </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#tests">Tests</a></li>
    <li><a href="#tech-stack">Tech Stack</a></li>
  </ol>
</details>

### About The Project

Необходимо покрыть тестами предлагаемые классы. Покрытие классов Feline, Cat и Lion на 100%

### Usage

Для подготовки отчета в терминале выполнить команды `mvn clean` и `mvn verify`

### Tests
* `AnimalTest` - тесты класса Animal
* `CatTest` - тесты класса Cat
* `FelineTest` - тесты класса Feline
* `LionTest` - тесты класса Lion
* `AnimalGetFoodExceptionTest` - тест исключения метода GetFood класса Animal
* `LionIncorrectInstanceExceptionTest` - тест исключения некорректного инстанцирования класса Lion

### Tech Stack

[![Java11][java]][javadoc-url]
[![Mockito][mockito]][mockito-url]
[![JaCoCo][jacoco]][jacoco-url]
[![JUnit4][junit]][junit-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[javadoc-url]: https://docs.oracle.com/en/java/javase/11/docs/api/index.html
[java]: https://img.shields.io/badge/Java_11-FF2D20?style=for-the-badge&logo=openjdk&logoColor=white
[mockito-url]: https://javadoc.io/static/org.mockito/mockito-core/4.6.1/index.html
[mockito]: https://img.shields.io/badge/Mockito_5.2-78A540?style=for-the-badge&logoColor=white
[jacoco-url]: https://www.eclemma.org/jacoco/
[jacoco]: https://img.shields.io/badge/jacoco-860A00?style=for-the-badge
[junit-url]: https://junit.org/junit4/
[junit]: https://img.shields.io/badge/JUnit_4-20232A?style=for-the-badge
