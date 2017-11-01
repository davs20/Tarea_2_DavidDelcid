Expresiones Regulares 
 
Una expresión regular define un patrón de búsqueda para cadenas de caracteres.La clase Pattern (segun la documentación del jdk1.4) es la representación compilada de una expresion regular, o lo que es lo mismo, representa a la expresión regular, que en el paquete java.util.regex necesita estar compilada. En castellano significa patrón. 
La clase Matcher es un tipo de objeto que se crea a partir de un patrón mediante la invocación del método Pattern.matcher. Este objeto es el que nos permite realizar operaciones sobre la secuencia de caracteres que queremos validar o la en la secuencia de caracteres en la que queremos buscar. En castellano lo mas parecido a esto es la palabra encajador. 
El paquete java.util.regex esta formado por dos clases, la clase Matcher y la clase Pattern y por una excepción, PatternSyntaxException. 
La podemos utilizar para comprobar si una cadena contiene o coincide con el patrón. El contenido de la cadena de caracteres puede coincidir con el patrón 0, 1 o más veces. 
 
Expresión Regular Usada  
 [parametros de busqueda] 
Ejemplo   [dav]   lo que significa que "d"  "a"  ó  "v" son validas  , la aplicación buscara en cada cadena la subcadena que coincida con el parametro de busqueda mencionado.  

Procedimiento Usado 

Pattern valida = Pattern.compile(busqueda); 
Matcher comprobacion = valida.matcher("+["+lista[a].nombre+" "+lista[a].apellido+"]"); 
if (comprobacion.find()) { 
    persona+=lista[a].nombre+" "+lista[a].apellido+" "+lista[a].edad+"\n"; 
 
} 

La variable búsqueda es el parámetro extraído del texfield para la búsqueda atreves del método getText(). 
Compile es un método estático que se encarga de representar la expresión regular ya compilada para su posterior uso , además se asigna al objeto valida para tener una referencia mas clara y elegante . 
 
Matcher es una clase que se encarga de tomar la expresión regular compilada  para su posterior comparación, con el parametro de busqueda 
 
 
 
Luego se usa la función estática find  de la clase Matcher, el metodo find  va buscando subcadenas dentro de la cadena de caracteres que cumplan el patrón compilado , si encuentra alguna devuelve una variable de tipo booleno que puede ser True si cumple con la expresión regular especificada, o False si no cumple 
 
Cuando se detecta que una cadena coincide con el patrón , se acumula junto con otros resultados que también puedan coincidir ejemplo 
 
David Martinez 
David Delcid 
 
Estas dos personas tienen el mismo nombre pero distinto apellido , si se manda como criterio de búsqueda  ¨Dav¨ la aplicación debería de devolver las dos personas antes mencionadas, para mejor interacción del usuario se ha usado "KeyEvent "  se debe establecer una objeto de tipo KeyEvent como parámetro para permitir escuchar cualquier tipo de desencadenador,  en este caso se ha usado el desencadenador KeyRealised dándole el efecto al usuario de una búsqueda en tiempo real. 
 
