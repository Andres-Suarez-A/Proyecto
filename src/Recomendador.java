import java.util.HashMap;
import java.util.Map;

class Recomendador {
    private Map<String, Recomendacion> recomendaciones;

    public Recomendador() {
        recomendaciones = new HashMap<>();
        recomendaciones.put("Accion, Lento, Hasta 2 horas, Apta para todo publico",
                new Recomendacion("Mad Max: Furia en el camino", "2015","Hbo Max, Amazon Prime y Apple Tv","Aunque está decidido a vagar solo por el páramo post-apocalíptico, Mad Max se une a Furiosa, una comandante fugitiva, y su banda, quienes están tratando de escapar de un señor de la guerra.","https://sololatino.net/peliculas/mad-max-furia-en-el-camino/", "https://1fichier.com/?jq71548rhqvns7kjfl47&af=4428047"));
        recomendaciones.put("Accion, Lento, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("King Kong","2005","Netflix, Amazon Prime y Apple Tv","Un grupo de exploradores, liderado por un extrovertido director de cine, visitan Skull Island para investigar todo lo relacionado con la leyenda del gorila gigante llamado King Kong. Ahí encuentran una jungla llena de criaturas prehistóricas.","https://sololatino.net/peliculas/king-kong/",""));
        recomendaciones.put("Accion, Lento, Hasta 2 horas, Para mayores de 18 años",
                new Recomendacion("Bad Boys","1995","Claro Video, Amazon Prime, Apple Tv y Hbo Max","Dos policías de Miami tienen 72 horas para encontrar 100 millones de dólares en heroína robada del almacén de evidencias de su comisaría, pero, para lograrlo, deben intercambiar sus identidades.","https://sololatino.net/peliculas/bad-boys-dos-policias-rebeldes/","https://1fichier.com/?cyx2npraat9bms449blc&af=4428047"));
        recomendaciones.put("Accion, Rapido, Hasta 1:30, Para mayores de 18 años",
                new Recomendacion("John Wick","2014","Claro Video, Amazon Prime, Netflix y Hbo Max","La ciudad de Nueva York se llena de balas cuando John Wick, un exasesino a sueldo, enfrenta a los mafiosos rusos que destruyeron todo aquello que él amaba y pusieron precio a su cabeza.","https://sololatino.net/peliculas/john-wick-otro-dia-para-matar/","https://1fichier.com/?i1xv1wbsfg7hlgkjnkip&af=4428047"));
        recomendaciones.put("Comedia, Rapido, Hasta 1:30, Apta para todo publico",
                new Recomendacion("Toy Story", "1995","Disney Plus","Woody, el juguete favorito de Andy, se siente amenazado por la inesperada llegada de Buzz Lightyear, el guardián del espacio.","https://sololatino.net/peliculas/toy-story/", "https://1fichier.com/?gl491t4p12lk6arbxeq0&af=4428047"));
        recomendaciones.put("Drama, Lento, Hasta 3 horas, Apta para todo publico",
                new Recomendacion("Sueño de fuga", "1994","Claro Video, Hbo Max, Amazon Prime y Apple Tv","Un hombre inocente es enviado a una corrupta penitenciaria de Maine en 1947 y sentenciado a dos cadenas perpetuas por un doble asesinato.","https://sololatino.net/peliculas/sueno-de-fuga/", ""));
        recomendaciones.put("Terror, Lento, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("The Conjuro", "2013","Hbo Max, Amazon Prime y Apple Tv","A principios de los años 70, Ed y Lorrain Warren, reputados investigadores de fenómenos paranormales, se enfrentan a una entidad demoníaca al intentar ayudar a una familia que está siendo aterrorizada por una presencia oscura en su aislada granja.","https://sololatino.net/peliculas/el-conjuro/","https://1fichier.com/?zcph8t3l5es0boa98k0g&af=4428047"));
        recomendaciones.put("Ciencia Ficcion, Lento, Hasta 3 horas, Apta para todo publico",
                new Recomendacion("El origen", "2010","Hbo Max, Amazon Prime y Apple Tv","Dom Cobb es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarles los secretos de sus subconscientes. Su habilidad lo ha vuelto muy popular en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama. Cobb obtiene la oportunidad de redimirse cuando recibe una tarea imposible: plantar una idea en la mente de una persona. Si tiene éxito, será el crimen perfecto, pero un enemigo se anticipa a sus movimientos.","",""));
        recomendaciones.put("Accion, Lento, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("The Avengers","2012","Disney Plus","El director de la Agencia SHIELD decide reclutar a un equipo para salvar al mundo de un desastre casi seguro cuando un enemigo inesperado surge como una gran amenaza para la seguridad mundial.","https://sololatino.net/peliculas/los-vengadores/","https://1fichier.com/?cl09r5kn7466osgm6tus&af=4428047"));
        recomendaciones.put("Ciencia Ficcion, Lento, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Parque jurasico","1993","Apple Tv, Amazon Prime y Claro Video","Tres expertos y otras personas son invitados a un parque de diversiones, donde se encuentran dinosaurios creados en base al ADN.","https://sololatino.net/peliculas/jurassic-park/","https://1fichier.com/?w5adnq1vfhrjjy8lpl8m&af=4428047"));
        recomendaciones.put("Romance, Rapido, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Orgullo y prejuicio", "2005","Netflix, Amazon Prime y Hbo Max","Elizabeth Bennet conoce al apuesto y adinerado Sr. Darcy, con quien, rápidamente, inicia una intensa y compleja relación.","https://sololatino.net/peliculas/orgullo-y-prejuicio/","https://1fichier.com/?bcclvcwwynsgtdc5yidh&af=4428047"));
        recomendaciones.put("Aventura, Lento, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("El señor de los anillos: la comunidad del anillo", "2001","Hbo Max, Amazon Prime y Apple Tv","Frodo Bolsón es un hobbit al que su tío Bilbo hace portador del poderoso Anillo Único, capaz de otorgar un poder ilimitado al que la posea, con la finalidad de destruirlo. Sin embargo, fuerzas malignas muy poderosas quieren arrebatárselo.","https://sololatino.net/peliculas/el-senor-de-los-anillos-la-comunidad-del-anillo/","https://kellywhatcould.com/x2yusjiohgps/download"));
        recomendaciones.put("Aventura, Lento, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Piratas del caribe: La maldición del perla negra", "2003","Disney Plus","El capitán Barbossa le roba el barco al pirata Jack Sparrow y secuestra a Elizabeth, amiga de Will Turner. Barbossa y su tripulación son víctimas de un conjuro que los condena a vivir eternamente y a transformarse cada noche en esqueletos vivientes.","https://sololatino.net/peliculas/piratas-del-caribe-la-maldicion-del-perla-negra/","https://1fichier.com/?nogds6ufiscynqgze67o&af=4428047"));
        recomendaciones.put("Comedia, Rapido, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("Duplex","2003","Apple Tv","Un escritor llamado Alex y su novia, Nancy, se mudan a un espacioso apartamento en Brooklyn, Nueva York. La anciana mujer que vive en el piso de arriba parece ser una dulce vecina, pero rápidamente sus constantes demandas y accidentes arruinan los intentos de Alex y Nancy de tener el hogar perfecto. Luego de que descubren que la mujer no puede ser desalojada, la pareja recurre a medidas menos convencionales para deshacerse de ella.","",""));
        recomendaciones.put("Terror, Lento, Hasta 2 horas, Para mayores de 18 años",
                new Recomendacion("Hereditary", "2018","Claro Video, Hbo Max, Amazon Prime y Apple Tv","Después de la muerte de la matriarca de la familia Graham, su hija, Annie, se muda a la casa con su familia. Annie espera olvidar los problemas que tuvo en su infancia allá, pero todo se tuerce cuando su hija empieza a ver figuras fantasmales.","https://www.cinecalidad.rs/pelicula/el-legado-del-diablo-2018-online-descarga/","https://1fichier.com/?6axkq55a9dh4qz8x8f3k&af=4428047"));
        recomendaciones.put("Comedia, Lento, Hasta 2 horas, Apta para todo publico",
                new Recomendacion("El viaje de chihiro", "2001","Netflix","Chihiro es una niña caprichosa que debe adentrarse en un mundo de fantasía para poder salvar a sus padres, convertidos en cerdos.","https://sololatino.net/peliculas/el-viaje-de-chihiro-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123-123/","https://ghbrisk.com/d/f0qvqarsx6xq"));
        recomendaciones.put("Ciencia Ficcion, Lento, Hasta 2 horas, Apta para todo publico",
                new Recomendacion("Volver al Futuro", "1985","Netflix, Claro Video y Amazon Prime","Una máquina del tiempo transporta a un adolescente a los años 50, cuando sus padres todavía estudiaban en la secundaria.","https://sololatino.net/peliculas/volver-al-futuro/","https://1fichier.com/?y3htgofmpwp6jbufhwlu&af=4428047"));
        recomendaciones.put("Accion, Rapido, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("Mission Impossible: Repercusion", "2018","Claro Video, Amazon Prime y Apple Tv","Un traficante de armas y un grupo de terroristas pretenden realizar un triple ataque nuclear con tres artefactos de plutonio, los cuales se pierden. Ethan Hunt y su equipo tendrán que recuperarlos antes de que caigan en las manos equivocadas.","https://sololatino.net/peliculas/mision-imposible-6-repercusion/","https://1fichier.com/?nrahyutxdtp9tzjzy56v?af=3159760"));
        recomendaciones.put("Terror, Rapido, Hasta 1:30, Para mayores de 18 años",
                new Recomendacion("La masacre de Texas", "1974","Amazon Prime","Un grupo de jóvenes se pierde en Texas y termina encontrándose con asesinos dementes que los persiguen con motosierras.","https://sololatino.net/peliculas/la-masacre-de-texas-3/","https://1fichier.com/?am8g6lq3tnv5q3chssgt&af=4428047"));
        recomendaciones.put("Drama, Lento, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("La lista de Schindler", "1993","Amazon Prime","La lista de Schindler es una película estadounidense de 1993 del género de drama histórico basada en la novela de ficción histórica El arca de Schindler del escritor australiano Thomas Keneally","https://sololatino.net/peliculas/la-lista-de-schindler/",""));
        recomendaciones.put("Terror, Lento, Hasta 3 horas, Para mayores de 18 años",
                new Recomendacion("It: capitulo dos","2019","Hbo Max, Amazon Prime y Apple Tv","En el misterioso pueblo de Derry, un payaso llamado Pennywise vuelve 27 años después para atormentar a los ahora adultos miembros del Club de los Perdedores, que se encuentran alejados unos de otros","https://sololatino.net/peliculas/it-capitulo-dos/","https://1fichier.com/?uv1olbcumq53xki54oks&af=4428047"));
        recomendaciones.put("Terror, Rapido, Hasta 1:30, Apta para todo publico",
                new Recomendacion("Coraline y la puerta secreta","2009","Claro Video, Amazon Prime y Apple Tv","Una niña descubre una puerta secreta en su nueva casa y entra a una realidad alterna que la refleja fielmente de muchas formas.","https://sololatino.net/peliculas/coraline-y-la-puerta-secreta/","https://1fichier.com/?do0vdo8ag63bouwlupkm&af=4428047"));
        recomendaciones.put("Romance, Lento, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Yo antes de ti","2016","Claro Video, Amazon Prime y Apple Tv","La vida de Louisa Clark, una chica alegre y alocada, que va empalmando un trabajo con otro para ayudar a su familia a subsistir, cambia por completo cuando comienza a trabajar como cuidadora de un joven millonario, quien quedó paralítico tras un accidente. Poco a poco, se va estableciendo entre ellos una conexión cada vez más íntima.","https://www.cinecalidad.rs/pelicula/yo-antes-de-ti-onlineeeee1-descarga/","https://1fichier.com/?7y8ktotutlbxgpmv5r7w&af=4428047"));
        recomendaciones.put("Romance, Lento, Hasta 2 horas, Para mayores de 18 años",
                new Recomendacion("Una pasion secreta","2008","Netflix","En la Alemania de postguerra, un adolescente tiene una aventura con una mujer mayor que esconde un secreto horrible.","",""));
        recomendaciones.put("Romance, Rapido, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("500 dias con ella","2009","Disney Plus","Tom, un escritor de tarjetas de felicitación y un romántico desesperado, se sorprende totalmente cuando su novia, Summer, repentinamente lo abandona. Él analiza los 500 días que pasaron juntos para intentar descubrir en que parte falló su relación amorosa y en el proceso, Tom redescubre sus verdaderas pasiones en la vida.","https://sololatino.net/peliculas/500-dias-con-ella/","https://1fichier.com/?rovkcj0p8o7gsrb7at86&af=4428047"));
        recomendaciones.put("Aventura, Lento, Hasta 3 horas, Apta para todo publico",
                new Recomendacion("Las crónicas de Narnia: El león, la bruja y el ropero","2005","Disney Plus","Cuatro niños viajan a través de un ropero a la tierra de Narnia, donde vivirán increíbles aventuras con la ayuda del león Aslan.","https://sololatino.net/peliculas/las-cronicas-de-narnia-el-leon-la-bruja-y-el-ropero/",""));
        recomendaciones.put("Aventura, Rapido, Hasta 2 horas,Para mayores de 13 años",
                new Recomendacion("La Momia","1999","Amazon Prime y Apple Tv","Rick O'Connell y un compañero descubren las ruinas de Hamunaptra, donde, luego, un grupo de jóvenes provocan la resurrección de la momia de un diabólico sacerdote egipcio.","https://sololatino.net/peliculas/la-momia/","https://1fichier.com/?ofe3hrm1sdr899qbueiq&af=4428047"));
        recomendaciones.put("Aventura, Rapido, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Uncharted", "2022","Netflix, Amazon Prime y Apple Tv","El cazador de tesoros Victor Sullivan recluta a Nathan Drake para que lo ayude a recuperar una fortuna de 500 años de antigüedad. Lo que comienza como un atraco se convierte en una competencia contra el despiadado Santiago Moncada.","https://sololatino.net/peliculas/uncharted/", "https://1fichier.com/?ujfkccv5n06kqip681rp&af=4428047"));

        recomendaciones.put("Ciencia Ficcion, Rapido, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Al filo del mañana", "2014","Claro Video, Apple Tv, Hbo Max y Amazon Prime","William Cage, un soldado muerto en acción mientras combatía contra unos alienígenas que invadieron la Tierra, entra en un bucle temporal en el cual revive constantemente y vuelve a intentar salvar el planeta, mejorando sus habilidades, conociendo mejor al enemigo, y acercándose cada vez más a la victoria. Sin embargo, el tiempo corre en su contra.","https://sololatino.net/peliculas/edge-of-tomorrow/", "https://1fichier.com/?29hex136k6ycj3vtyohx&af=4428047"));

        recomendaciones.put("Romance, Rapido, Hasta 2 horas, Para mayores de 18 años",
                new Recomendacion("De amor y otras adicciones", "2010","Netflix y Disney Plus","Maggie es una mujer independiente que ha decidido vivir sin ataduras. Pero conoce a Jamie, un joven cuyo irresistible encanto funciona no solo con las mujeres, sino también dentro del mundo de las ventas farmacéuticas.","https://sololatino.net/peliculas/amor-y-otras-drogas/", "https://1fichier.com/?9dnioucc6l6vyeaqkgq2&af=4428047"));

        recomendaciones.put("Comedia, Rapido, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("Proyecto X", "2012","Claro Video, Hbo Max, Apple Tv y Amazon Prime","Tres estudiantes de secundaria deciden organizar una fiesta salvaje en casa de uno de ellos, aprovechando que sus padres no están. Quieren hacer que la fiesta sea inolvidable, así que deciden grabarlo todo. Parece que la fiesta es todo un éxito: todo el mundo está bebiendo y los ánimos están por los aires. Sin embargo, una serie de complicaciones imprevistas harán que la fiesta se descontrole.","https://sololatino.net/peliculas/proyecto-x/", "https://1fichier.com/?8au592ul8boh3h64x3cx&af=4428047"));

        recomendaciones.put("Drama, Rapido, Hasta 2 horas, Para mayores de 18 años",
                new Recomendacion("Whiplash", "2014","Hbo Max, Amazon Prime y Apple Tv","Andrew Neiman es un joven y ambicioso baterista de jazz. Marcado por el fracaso de la carrera literaria de su padre, está obsesionado con alcanzar la cima dentro del elitista conservatorio de música de la Costa Este en el que estudia.","https://sololatino.net/peliculas/whiplash/", "https://1fichier.com/?1gym0pjdoiodbe5sze1g&af=4428047"));

        recomendaciones.put("Terror, Rapido, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("Actividad Paranormal", "2007","Google Play","Una joven pareja se muda a su primera casa nueva pero son perturbados por lo que parece ser una presencia sobrenatural que se vuelve más activa durante la noche.","https://sololatino.net/peliculas/actividad-paranormal/", "https://1fichier.com/?57x5r7hwfdzqe2oyk1jt&af=4428047"));

        recomendaciones.put("Romance, Rapido, Hasta 1:30, Para mayores de 18 años",
                new Recomendacion("Ninfomanía", "2013","Amazon Prime","Una mujer excesivamente promiscua le cambia la historia de su pasado erótico a un desconocido que la encontró gravemente golpeada y la llevó a su casa para curar sus heridas.","https://sololatino.net/peliculas/nymphomaniac/", "https://1fichier.com/?xyz129"));

        recomendaciones.put("Ciencia Ficcion, Rapido, Hasta 2 horas, Apta para todo publico",
                new Recomendacion("Big Hero 6", "2014","Disney Plus","Cuando un giro inesperado de eventos los sumerge en el medio de un peligroso plan, un niño prodigio, su robot y sus amigos se convierten en héroes de alta tecnología en una misión para salvar su ciudad.","https://sololatino.net/peliculas/gran-heroe/", "https://1fichier.com/?z5at4422nk0wk3dechl0&af=4428047"));

        recomendaciones.put("Aventura, Rapido, Hasta 1:30, Apta para todo publico",
                new Recomendacion("Cómo entrenar a tu dragón", "2010","Claro Video, Amazon Prime y Apple Tv","Un adolescente vikingo inadaptado ve la oportunidad de cambiar el curso del futuro de su clan cuando se hace amigo de un dragón herido.","https://sololatino.net/peliculas/como-entrenar-a-tu-dragon/", "https://1fichier.com/?2psmj128p653alcyqtot&af=4428047"));

        recomendaciones.put("Accion, Rapido, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("Duro de matar", "1988","Disney Plus","John McClane, policía de Nueva York, llega a Los Ángeles para celebrar la Navidad, pero se ve envuelto en una lucha contra un grupo de malhechores que toman de rehén a su esposa en un rascacielos, el Nakatomi Plaza.","https://sololatino.net/peliculas/duro-de-matar/", "https://1fichier.com/?ryfcb7e8kjnm2owrsgqo&af=4428047"));
        recomendaciones.put("Aventura, Rapido, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("Jungle Cruise", "2021","Disney Plus","Lily viaja de Londres al Amazonas y contrata los servicios del problemático Frank para que la guíe río abajo en La Quila, su barco destartalado, con la intención de descubrir un árbol con habilidades curativas.","https://sololatino.net/peliculas/jungle-cruise/", "https://1fichier.com/?abc001"));

        recomendaciones.put("Romance, Rapido, Hasta 2 horas, Apta para todo publico",
                new Recomendacion("La La Land", "2016","Apple Tv y Amazon Prime","Sebastian, un pianista de jazz, y Mia, una aspirante a actriz, se enamoran locamente; pero la ambición desmedida que tienen por triunfar en sus respectivas carreras, en una ciudad como Los Ángeles, repleta de competencia y carente de piedad, pone en peligro su amor","https://sololatino.net/peliculas/la-la-land/", "https://1fichier.com/?lbrjcqlekyxiputom9m6&af=4428047"));

        recomendaciones.put("Comedia, Lento, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("El gran hotel Budapest", "2014","Disney Plus","El conserje de un elegante hotel europeo inicia una interesante amistad con un joven compañero de trabajo.","https://sololatino.net/peliculas/el-gran-hotel-budapest/", "https://1fichier.com/?abc003"));

        recomendaciones.put("Ciencia Ficcion, Rapido, Hasta 1:30, Para mayores de 18 años",
                new Recomendacion("Upgrade", "2018","Apple Tv y Amazon Prime","Un hombre minusválido se somete a una operación experimental que le dotará de una agilidad y fuerza sobrehumanas porque tiene una obsesión: vengarse de los criminales que asesinaron a su esposa.","https://sololatino.net/peliculas/upgrade/", "https://1fichier.com/?uwgbz1ji3tplpwosoiri&af=4428047"));

        recomendaciones.put("Terror, Rapido, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("La huérfana", "2009","Hbo Max, Amazon Prime y Apple Tv","Devastados por la pérdida de su bebé nonato, Kate y John deciden adoptar una niña. En el orfanato, ambos se enamoran de una pequeña llamada Esther, y muy pronto la pareja lleva a su nueva hija a casa. Pero cuando se desarrollan una serie de eventos misteriosos, Kate empieza a sospechar que algo endemoniado se oculta detrás del rostro angelical de la niña.","https://sololatino.net/peliculas/la-huerfana/", ""));

        recomendaciones.put("Accion, Rapido, Hasta 2 horas, Apta para todo publico",
                new Recomendacion("Meteoro", "2008","Amazon Prime, Apple Tv y Hbo Max","Después de rechazar una lucrativa oferta de un empresario, Speed Racer descubre que algunas de las más importantes carreras están arregladas por magnates sin principios, que manipulan a los principales pilotos de carrera para tener más ganancias.","https://sololatino.net/peliculas/speed-racer/", "https://1fichier.com/?abc007"));

        recomendaciones.put("Aventura, Lento, Hasta 1:30, Para mayores de 18 años",
                new Recomendacion("The Beach", "2000","Disney Plus","Los problemas surgen en una secreta isla paraíso cuando un audaz viajero americano aparece en la escena.","https://sololatino.net/peliculas/la-playa/", "https://1fichier.com/?meauk4jirf4xw1ezld8i&af=4428047"));

        recomendaciones.put("Romance, Lento, Hasta 3 horas, Para mayores de 18 años",
                new Recomendacion("Titanic", "1997","Disney Plus","Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.","https://sololatino.net/peliculas/titanic/", "https://1fichier.com/?abc009"));

        recomendaciones.put("Comedia, Lento, Hasta 1:30, Para mayores de 18 años",
                new Recomendacion("Ted", "2012","Netflix, Amazon Prime y Hbo Max","Cuando John Bennett era un niño pequeño, pidió el deseo de que Ted, su querido oso de peluche, cobrara vida. Treinta años más tarde, Ted continúa siendo el compañero de John, ante el disgusto de Lori, la novia de John. Aunque el disgusto de Lori se ve agravado por el constante consumo de la pareja de cerveza y marihuana, ella no es quien está más decepcionada con John; ya que puede necesitar la intervención del juguete de John para hacerlo madurar.","https://sololatino.net/peliculas/ted/", "https://1fichier.com/?ouijnbkd3vq4fepwgdn9&af=4428047"));

        recomendaciones.put("Ciencia Ficcion, Rapido, Hasta 1:30, Apta para todo publico",
                new Recomendacion("Wall-E", "2008","Disney Plus","Luego de pasar años limpiando la Tierra desierta, el robot Wall-E conoce a EVA y la sigue por toda la galaxia.","https://sololatino.net/peliculas/wall-e/", ""));

        recomendaciones.put("Drama, Lento, Hasta 1:30, Apta para todo publico",
                new Recomendacion("La ladrona de libros", "2013","Disney Plus","En la Alemania de la era nazi, el Ángel de la Muerte narra la historia de una niña adoptada, quien aprende a leer gracias a su padre. Ella se hace amiga de un joven judío, cuyos padres están ocultando","https://sololatino.net/peliculas/la-ladrona-de-libros/", "https://1fichier.com/?mqedl4ber4cpna125w2x&af=4428047"));

        recomendaciones.put("Terror, Lento, Hasta 1:30, Apta para todo publico",
                new Recomendacion("Monster House", "2006","Netflix, Hbo Max, Amazon Prime y Claro Video","Ningún adulto le cree a tres chicos que afirman que una residencia de la vecindad es una criatura viviente que representa un peligro. Ante la cercanía del Día de Brujas, el trío debe hallar la forma de destruir su estructura antes de que los niños inocentes resulten afectados.","https://sololatino.net/peliculas/la-casa-de-los-sustos/", ""));

        recomendaciones.put("Accion, Lento, Hasta 1:30, Apta para todo publico",
                new Recomendacion("Sky High: Super escuela de héroes", "2005","Disney Plus","Dos superhéroes envían a su hijo rebelde a una escuela de entrenamiento con la esperanza de que él siga sus pasos.","https://sololatino.net/peliculas/super-escuela-de-heroes/","https://1fichier.com/?n7udp970mx8lj7gjefyp&af=4428047"));

        recomendaciones.put("Aventura, Rapido, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("Avengers: Endgame", "2019","Disney Plus","Los Vengadores comprenden por fin lo frágil que es la realidad y los sacrificios que hay que hacer para mantenerla, en una historia de amistad, trabajo en equipo y sobre dejar a un lado las diferencias para superar un obstáculo imposible.","https://sololatino.net/peliculas/avengers-endgame/", "https://1fichier.com/?zv826ydrfg9u4wconbon&af=4428047"));

        recomendaciones.put("Romance, Lento, Hasta 1:30, Apta para todo publico",
                new Recomendacion("La princesa prometida", "1987","Amazon Prime","Un joven que se vio obligado a abandonar a su amada para irse al mar, donde se convirtió en pirata, rescata a la mujer que siempre la amó cuando estaba a punto de casarse con un príncipe malvado.","https://sololatino.net/peliculas/la-princesa-prometida/", "https://1fichier.com/?abc016"));

        recomendaciones.put("Comedia, Rapido, Hasta 3 horas, Para mayores de 18 años",
                new Recomendacion("El lobo de Wall Street", "2013","Amazon Prime y Apple Tv","El corredor de bolsa neoyorquino Jordan Belfort, que fundó la empresa de corretaje Stratton Oakmont cuando aún no había cumplido los 20 años, adquiere hábitos de excesos y corrupción.","https://sololatino.net/peliculas/el-lobo-de-wall-street/", "https://1fichier.com/?j72x1ce8lvt71g5uiu2c&af=4428047"));

        recomendaciones.put("Drama, Lento, Hasta 2 horas, Para mayores de 13 años",
                new Recomendacion("En busca de la felicidad", "2006","Amazon Prime","La vida es una lucha para Chris Gardner. Expulsado de su apartamento, él y su joven hijo se encuentran solos sin ningún lugar a donde ir. A pesar de que Chris eventualmente consigue trabajo como interno en una prestigiada firma financiera, la posición no le da dinero. El dúo debe vivir en un albergue y enfrentar muchas dificultades, pero Chris no se da por vencido y lucha por conseguir una vida mejor para él y su hijo.","https://sololatino.net/peliculas/en-busca-de-la-felicidad/", "https://1fichier.com/?1ltmnhgd10bsz75hkru5&af=4428047"));

        recomendaciones.put("Terror, Rapido, Hasta 3 horas, Para mayores de 18 años",
                new Recomendacion("Doctor Sueño", "2019","Amazon Prime y Apple Tv","Dan, alcohólico y traumatizado por lo que le pasó siendo un niño en el hotel Overlook, conoce a Abra, una adolescente que posee el mismo don que él. Dan tratará de salvar a Abra de un grupo de siniestros personajes que ansían la inmortalidad y aspiran alcanzarla alimentándose de los poderes psíquicos de gente como ellos.","https://sololatino.net/peliculas/doctor-sueno/", "https://1fichier.com/?mw6lbexyijyo459bb1fl&af=4428047"));

        recomendaciones.put("Ciencia Ficcion, Rapido, Hasta 3 horas, Para mayores de 13 años",
                new Recomendacion("Interestelar", "2014","Claro Video, Hbo Max, Amazon Prime y Apple Tv","Gracias a un descubrimiento, un grupo de científicos y exploradores, encabezados por Cooper, se embarcan en un viaje espacial para encontrar un lugar con las condiciones necesarias para reemplazar a la Tierra y comenzar una nueva vida allí.","https://sololatino.net/peliculas/interestelar/", "https://1fichier.com/?p4n4xwgmkldwkyg5mcr4&af=4428047"));
        recomendaciones.put("Comedia, Lento, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("El Dictador","2012","Apple Tv y Amazon Prime","Un tirano de África del Norte arriesga su vida para asegurar que la democracia nunca llegue al país al que mantiene oprimido.","https://sololatino.net/peliculas/el-dictador/","https://1fichier.com/?boht5e0oyqhmx44h63cu&af=4428047"));
        recomendaciones.put("Terror, Lento, Hasta 1:30, Para mayores de 13 años",
                new Recomendacion("El proyecto de la bruja de blair","1999","Apple Tv y Amazon Prime","Tres estudiantes de cine se pierden en un bosque habitado por una bruja, durante su investigación de la leyenda.","https://sololatino.net/peliculas/el-proyecto-de-la-bruja-de-blair/","https://1fichier.com/?oroan344kpq8s44yxgto&af=4428047"));
        recomendaciones.put("Aventura, Lento, Hasta 2 horas, Para mayores de 18 años",
                new Recomendacion("El hombre del norte","2022","Amazon Prime, Apple Tv y Claro Video","El príncipe Amleth está a punto de convertirse en hombre pero, en ese momento, su tío asesina brutalmente a su padre y secuestra a la madre del niño. Dos décadas después, Amleth es un vikingo que tiene la misión de salvar a su madre.","https://sololatino.net/peliculas/el-hombre-del-norte/","https://1fichier.com/?6r53ozk2q5rqfz85ytw1&af=4428047"));



    }


    public Recomendacion recomendar(String tipo, String ritmo, String duracion, String edades) {
        String clave = tipo + ", " + ritmo + ", " + duracion + ", " + edades;
        return recomendaciones.getOrDefault(clave, new Recomendacion("No hay recomendación disponible","","","", "",""));
    }

}
