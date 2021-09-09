# **PRUEBAS UNITARIAS Y DE ACEPTACION  EN JAVA**
## **Integrantes :**
* ### **Kevin**
* ### **Jonathan**
* ### **Johan**

## **Contenido**


## **Objetivo :**
* ####  Conocer como se pueden realizar este tipo de pruebas en el Lenguaje Java usando las herramientas **Cucumber** , **Junit** y **Gradle** implementando el entorno de desarrollo **IntelliJ IDEA** 

## **Herramientas:**

* #### **Cucumber :** Cucumber es una herramienta para implementar metodologías como el Behaviour Driven Development (BDD) o desarrollo basado en comportamiento, que permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas.Estas descripciones funcionales se escriben en un lenguaje específico de dominio, legible por el área de negocio, denominado Gherkin. Si se desea profundizar mas puede ir al siguiente link 

<br>

* #### **Junit :** JUnit se trata de un Framework Open Source para la automatización de las pruebas (tanto unitarias, como de integración) en los proyectos Software. El framework provee al usuario de herramientas, clases y métodos que le facilitan la tarea de realizar pruebas en su sistema y así asegurar su consistencia y funcionalidad. Si se desea profundizar mas puede ir al siguiente link 

<br>

* #### **Gradle :** Gradle, es una herramienta que permite la automatización de compilación de código abierto, la cual se encuentra centrada en la flexibilidad y el rendimiento. Los scripts de compilación de Gradle se escriben utilizando Groovy o Kotlin DSL (Domain Specific Language). Si se desea profundizar mas puede ir al siguiente link 

<br>

* #### **IntelliJ IDEA :** IntelliJ IDEA es un Entorno de Desarrollo Integrado (IDE) creado por JetBrains. Está construido en Java y proporciona una experiencia consistente en Windows, macOS y Linux para muchos lenguajes diferentes. Si se desea profundizar mas puede ir al siguiente link 

<br>

## **Instalacion :**

#### Acontinuacion describiremos el proceso de instalacion de las herramientas  **IntelliJ IDEA** y **Gradle** que nos permitiran crear el proyecto y realizar las pruebas deseadas 

<br>

### **Descarga de Gradle  e IntelliJ IDEA**
<br>

*   #### Incialmente descargamos la herramienta **Gradle**,    para lo cual  nos diriguimos al siguiente link, donde automaticamente empezara la descarga como podemos ver en la siguente imagen:
    <br>

    ![DesgarcaGadel](imagenes/DesgarcaGadel.png) 
    #### Como podemos ver en la imagen la version que se descargo es la 7.2, esta es la version que nosotros usamos. 
    
<br>

*  #### Posteriormente descargaremos el **IntelliJ IDEA** desde el  siguiente  link.


   #### Dentro del link tendremos 2 opciones de descargar, como se puede ver en la siguiente imagen:

   <br>   
   
   ![DesgarcaIntellij](imagenes/DesgarcaIntellij.png)
   #### Nosotros hemos decidido descarga la version Community como se podemos ver a continuacion 

   <br> 

   ![DesgarcaIntellij2](imagenes/DesgarcaIntellij2.png)

<br>

### **Instalacion Gradel**

#### Luego de haber descargado  ambas herramientas configuraremos inicialmente la herramienta **Gradle** siguiendola documentacion de la misma, esto lo podemos ver en la imagen que aparece  a continuacion

<br>

<div style="text-align:center">

![ConfiguracionGradle](imagenes/ConfiguracionGradle.png)

</div>

<br>

#### Con base en lo anterior lo primero que se realizo fue el  descomprimir el archivo punto zip que quedo al realizar la descarga, esto se hizo dentro de una carpeta que nos resulto comoda de manejar; esto se puede  ver  a continuacion:

<br>

<div style="text-align:center">

![ArchivoZip](imagenes/ArchivoZip.png)

<br>

![Descomprimindo](imagenes/Descomprimindo.png)

<br>

![DescompresionZip](imagenes/DescompresionZip.png)

</div>



#### Ya descomprimido el archivo y ubicado en una carpeta que elegimos, realizamos la configuracion de las variables de entorno para que el sistema reconozca la herramienta. Esto lo vamos a realizar de la siguiente forma:

<br>


* #### **1)** Buscamos desde la barra de busqueda la opcion variables  de entorno y hacemos clic sobre ella como se muestra en la siguiente imagen

  ![BuscarVariablesEn](imagenes/BuscarVariablesEn.png)

* #### **2)** Luego de dar clic nos aparecera una venta y damos  clic sobre la opcion que dice variables de entorno como se muestra acontinuacion 
  ![VentaIVariablesEn](imagenes/VentaIVariablesEn.png)

* #### **3)** Ya en esta  ventana, en la seccion que dice variables del sistema  dimos clic en nuevo para crear la nueva variable, esto se puede ver en la siguiente imagen 
  ![VentaVariablesEn](imagenes/VentaVariablesEn.png)

* #### **4)** Nos aparece una subventa que nos permitira ingresar el nombre de  la variable y la ruta donde se encuentra. El nombre por defecto que se debe colocoar es GRADLE_HOME  y  la ruta que se agrega corresponde a la ruta donde descomprimimos  la herramienta **Gradle**; luego de llenados estos datos damos aceptar como vemos a continuacion
  ![AgregarVariablesEn](imagenes/AgregarVariablesEn.png)

* #### **5)** Luego de ingresada esta nueva variable nos dirigimos a la variable Path dando clic sobre ella, nos aperecera una nueva ventana donde crearemos una nueva ruta la cual va a ser **%GRADLE_HOME%\bin** que hara referencia a la variable antes creada, al terminar de ingresar la ruta, damos en aceptar como se muestra en la imagen
   ![ConfigurarPath](imagenes/ConfigurarPath.png)

* #### **6)** Terminado lo anterior, dimos clic en aceptar en la ventana de variables de entornopara que nos guarde todo lo que hemos hecho, esto podemos se puede visualizar en la siguiente imagen 
    ![FinalizarConfig](imagenes/FinalizarConfig.png)

* #### **7)** Por ultimo abrimos el cmd para verificar si quedo correctamente configurado, para  ello  ejecutamos el gradle -v como se ve acontinuacion
    ![PruebaConfig](imagenes/PruebaConfig.png)

<br>

### **Instalando IntelliJ IDEA**

#### Luego de haber instalado la herramienta Gradle


### **Pruebas :**

### **Conclusiones**

### **Bibliografia :**

- #### https://docs.gradle.org/current/userguide/installation.html

- #### https://cucumber.io/docs/tools/java/

- #### https://cucumber.io/docs/installation/java/

- #### https://gradle.org/next-steps/?version=7.2&format=all

- #### https://www.codecademy.com/articles/kotlin-getting-started-with-intellij

- #### https://openwebinars.net/blog/que-es-gradle/

- #### http://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/248

- #### https://www.pragma.com.co/blog/junit-vs.-cucumber-herramientas-de-automatizacion-de-pruebas

- #### https://www.jetbrains.com/idea/download/#section=windows