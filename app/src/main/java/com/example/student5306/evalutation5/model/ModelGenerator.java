package com.example.student5306.evalutation5.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yvan Moté on 31/03/2016.
 */
public class ModelGenerator {

    public interface NewsListener {
        void onReceiveNews(List<News> newsList);
    }

    public static void retrieveTopNews(NewsListener listener) {
        List<News> allNews = new ArrayList<>();

        allNews.add(new News("Sébastien Cayotte est reparti sur son Vél'Oh",
                "«Luxembourg-Paris pour des Sourires»: vous vous souvenez? C'était le défi que s'était lancé Sébastien Cayotte l'été dernier. Se rendre à Paris avec un Vél'Oh, les vélos de Luxembourg-Ville, dotés de seulement trois vitesses, pour la bonne cause.\n Sébastien, 21 ans, a remis ça. Il est parti mercredi pour Amsterdam cette fois-ci, avec un gros pari: faire Luxembourg-Bruxelles d'une traite sans dormir, une partie qu'il estime à 24 heures sur sa page Facebook. Il relève ce défi toujours pour la même cause: récolter des fonds pour la Fondation Kriibskrank Kanner, pour aider les enfants atteints d'un cancer.",
                "https://blobsvc.wort.lu/picture/224379bd4d4e82c6f2bb3e28db59f745/738/413/crop/0/265/951/800/wortv3/4f8c10094283da3cd53c9c102436fdf17778ce4d"));
        allNews.add(new News("Les 10 produits mythiques de la marque à la pomme",
                "(CR avec AFP) - C'est ce vendredi 1er avril qu'Apple célèbre ses 40 ans, une période durant laquelle la société américaine n'a cessé de faire preuve d'innovation.",
                "https://blobsvc.wort.lu/picture/ea9642c7ab8c863a51de1bf57a5269ae/977/639/wortv3/ae3ea3283bbc0ea5998378397f418514c13b6d2c"));
        allNews.add(new News("Les radars soupçonnés de trop flasher",
                "Dix radars fonctionnent au Luxembourg depuis maintenant deux semaines. Le chiffre de 10.000 conducteurs flashés a été dépassé il y a quelques jours. Il n'existe cependant aucun chiffre précis actuellement, car les données du Centre national de traitement sont encore traitées à la main. 10.000 flashes en deux semaines, personne ne s'y attendait. «Je suis très surpris d'un tel nombre d'infractions alors que la campagne d'informations sur les radars avait tout de même été conséquente», estime le président de l'Association nationale des victimes de la route, Raymond Schintgen. Du côté des automobilistes, on s'interroge sur la fiabilité de ces appareils: quelle est leur marge de tolérance? Celle-ci est-elle réellement prise en compte? Cette tolérance est normalement de 3 km/h lors d'une vitesse enregistrée inférieure à 100 km/h. Au-delà de 100 km/h, la tolérance est de 3%. Cela est d'ailleurs précisé sur les procès-verbaux adressés aux conducteurs concernés.",
                "https://blobsvc.wort.lu/picture/85ad288bde218929614e26fb3d67d5a6/860/484/wortv3/a3180e6c9291beb13fd3b40ab75bd844a6a8889d"));
        allNews.add(new News("Des routes chargées pour ce week-end",
                " Fin de la première semaine de vacances pour la Belgique, le Luxembourg et la Grande Bretagne, début des congés pour la France: la circulation promet d'être dense en ce premier week-end d'avril. La circulation sera difficile ce samedi en Bourgogne et en Rhône-Alpes, au premier jour des vacances de la zone B : Bison futé voit orange dans ces régions dans le sens des départs, vert dans le sens des retours et vert au niveau national. Le reste du week-end est coloré de vert au niveau national. Vendredi, Bison Futé prévoit des bouchons \"plus intenses que d'habitude pour quitter les grandes métropoles du pays\", en particulier celles de la zone B, notamment Marseille, Nice, Lille et Strasbourg. Des bouchons sont également attendus en direction des zones côtières et des Alpes. Il est conseillé d'éviter de quitter les grandes métropoles entre 16H00 et 19H00.",
                "https://blobsvc.wort.lu/picture/dcc53e21f0b6e30e2455d2839234ff51/860/484/wortv3/1e496142c7741d602dc2cfe4aa47fdab725a1cbb"));
        allNews.add(new News("Les cadeaux très symboliques des «Artisans de la Paix»",
                "Cent ans après la sanglante Bataille de Verdun qui opposa les armées française et allemande durant la Grande Guerre -entre février et décembre 1916- chefs d'Etats et de gouvernement, ministres et ambassadeurs s'évertuent depuis des décennies à gagner la paix. Baptisée «Les Artisans de la Paix», une exposition inédite -dans laquelle figurent aussi des pièces luxembourgeoises- ouvre ce 31 mars 2016 et pour un an, au Centre mondial de la Paix... à Verdun. Les «Artisans» dont il est question ici, «ce sont à la fois les responsables politiques et diplomatiques qui évitent que ne se reproduisent des massacres comme ceux de 1916 et ce sont aussi les artisans qui créent ces objets», résume d'un trait Laurent Stefanini. Le chef du Protocole de la République française était de passage à Verdun pour le vernissage de cette exposition axée sur les cadeaux officiels que s'échangent les grands de notre monde. Des présents simples ou somptueux, soigneusement choisis, plein de symbolique et de messages qui conduisent le visiteur à mieux saisir les grandes crises récentes (Grèce, Ukraine, Mali) et les enjeux des relations internationales.",
                "https://blobsvc.wort.lu/picture/985d6dac1696828905e99fedfb5d9c30/632/450/wortv3/146f7ae368f972d3b088b161d0fbda2cf1aedd31"));
        allNews.add(new News("«Un monde 100% végétalien n'existera jamais»",
                "Ils sont de plus en plus nombreux à cesser de manger viandes et produits issus de la production animale: on les appelle des végétaliens, ou \"vegans\". Mais c'est quoi être un vegan? Pourquoi en arriver là? Nous avons rencontré Thomas et Camille, deux vegans luxembourgeois depuis de nombreuses années. Camille a 46 ans et plus de 20 années de végétarisme derrière lui. Si cette pratique lui semble des plus naturelles aujourd'hui, cela n'a pas toujours été le cas. Au repas de famille, il pouvait passer plusieurs heures devant son assiette de viande, contraint par ses parents de finir son plat. «Ils ne comprenaient pas mon choix. Ce n'était pas bien vu à l'époque de ne pas manger de viande». Car cette prise de conscience éthique lui est venue plutôt jeune. A l'âge de 14 ans, Camille décide d'arrêter de consommer de la viande et devient végétarien. «J'ai réduit petit à petit». Mais le déclic apparaît durant ses études à Liège. «On s'interroge, on se documente et toutes ces réflexions aboutissent finalement au véganisme», explique-t-il. Cela fait donc plus de 8 ans qu'il est devenu vegan.",
                "https://blobsvc.wort.lu/picture/97db0dd574ef65b23b0b00d1fbfe6d65/1022/300/crop/0/421/832/666/wortv3/a2bd29cdfbacde2769ca50d3f59df5628c2735d5"));

        if(listener!=null) {
            listener.onReceiveNews(allNews);
        }

    }

    public static void retrieveLifeStyleNews(NewsListener listener) {
        List<News> allNews = new ArrayList<>();

        allNews.add(new News("Le 'blackout tattoo' fait couler beaucoup d'encre",
                "Autrefois l'apanage des grands rebelles, le tatouage est devenu courant, notamment chez les fashionistas. La dernière tendance en la matière s'avère toutefois extrême... Le Singapourien Chester Lee d'Oracle Tattoo a récemment mis en lumière une nouvelle tendance en publiant une photo de l'une de ses clientes sur Instagram. La demoiselle arbore un 'blackout', un imposant tatouage opaque totalement noir. Il recouvre le haut du torse et déborde sur toute la longueur du bras.",
                "https://blobsvc.wort.lu/picture/dff7091181a62d53b042724b7089988b/860/484/crop/0/2/818/461/wortv3/bfcbde8e543855c239120d05ba1c61c1f67a3419"));
        allNews.add(new News("Adopter le look \"sourcils décolorés\")",
                "S'il est une tendance beauté que l'on a retrouvée sur tous les podiums des défilés automne-hiver 2016, c'est bien celle des sourcils décolorés. Exit le look Cara Delevingne. Même Rihanna, pourtant adepte du sourcil imposant et foncé, le confirme en couverture de l'édition d'avril du magazine Vogue : la tendance est à la douceur et à la légèreté. Comme on l'a vu sur le podium, les sourcils éclaircis ou totalement décolorés ont leurs avantages. Premièrement, le maquillage en devient plus spectaculaire, comme l'ont illustré Giamba à Milan et Givenchy à Paris, où l'arcade sourcilière paraissait si nue que le contraste avec le trait de kohl permettait un effet très éthéré. Chez Giorgio Armani à Milan, le look était plus hachuré, offrant de la douceur au visage des mannequins. La structure du visage était ainsi mise en valeur. Cela peut aussi donner à la coloration des cheveux une allure plus naturelle.",
                "https://blobsvc.wort.lu/picture/7318e648683f713f731aa9e5b614c7f6/860/484/wortv3/702ef6745836e65e4ff296d62026d49adaea0816"));
        allNews.add(new News("Le dentiste effraie encore",
                "Certains clichés ont la dent dure, comme le montre le dernier sondage réalisé par OpinionWay pour le site Doctolib, rendu public ce mardi 29 mars. Celui-ci révèle que près d'un Français sur deux (48%) a peur d'aller voir le dentiste. Un nombre qui grimpe à 54% chez les 25‐34 ans et 55% chez les femmes. La peur de la douleur figure parmi les principales appréhensions des personnes interrogées (40%). Là encore, ce sont les plus jeunes (25-34 ans) qui semblent le plus touchés (49%) et les femmes (47%)." ,
                "https://blobsvc.wort.lu/picture/4d193534447a58dc5950024a1b361c0c/860/484/wortv3/9ed10d5b16afccdb2a1d88e0af1a93e52f5033a4"));
        allNews.add(new News("6 expériences insolites pour les vacances Tourisme",
                "À l'approche des vacances de printemps et d'été, tour d'horizon de ces nouveaux concepts touristiques pour passer des vacances originales. Certains voyageurs choisissent un hôtel pour son emplacement, voire le prestige se rattachant à son nom. MyRoomIn propose quant à elle de choisir précisément une chambre pour profiter de son ambiance, de son décor... La plate-forme de réservation se consacre pour le moment à la ville de Paris, mais elle pourrait s'ouvrir à New York, Londres et le quart sud-est de la France. Les internautes visitent virtuellement la chambre pour être sûrs de leur choix. Ils seront certains de séjourner dans les lieux à l'arrivée. MyRoomIn propose ainsi un pied de nez aux réservations décevantes qui laissent miroiter de jolies chambres, qui se révèlent en vrai être situées en face d'une cage d'escalier, pire sans fenêtre.",
                "https://blobsvc.wort.lu/picture/d8db94fcfd18ccc8e9148ac3081ec697/860/484/wortv3/5edf3c2825389f388248de54df8bce73ac7551a0"));
        allNews.add(new News("Comment changer le regard sur l'autisme?",
                "Changer le regard sur l'autisme en dépassant les préjugés et les idées reçues, c'est l'objectif et le pari d'une campagne de sensibilisation lancée par le gouvernement français à l'occasion de la journée mondiale de l'autisme le 2 avril. Présentée mardi par la secrétaire d'État aux Personnes handicapées et à la lutte contre l'exclusion Ségolène Neuville, cette campagne de communication, via un film et une expérience interactive sur internet, vise à \"sensibiliser et changer le regard sur l'autisme\", mais aussi à \"informer\" le grand public. \"Les enfants et adultes autistes souffrent du regard porté sur eux. Les parents témoignent sans relâche des idées fausses, des difficultés, voire des discriminations que leurs enfants, mais aussi eux-mêmes, subissent au quotidien\", rappelle la ministre pour qui il faut donc \"agir sans attendre pour toucher le grand public\".",
                "https://blobsvc.wort.lu/picture/a6b35676495f40c3da259080dad1a699/860/484/wortv3/eae40c76d9cbb4a4a7cb0ded5d7a19a0d396a58e"));
        allNews.add(new News("Passer son temps sur son smartphone cacherait une anxiété",
                "Selon une étude américaine, publiée dans le Computers in Human behaviours, le recours aux smartphones notamment l'utilisation massive des applications et divertissements, révèlerait souvent une volonté de se protéger de la réalité, de certaines expériences et émotions négatives. Après avoir suivi 300 étudiants qui utilisaient très fréquemment leur téléphone portable, des chercheurs de l'université de l'Illinois aux Etats-unis, se sont rendus compte que l'anxiété et la dépression touchaient principalement les jeunes adultes qui se servaient de leur smartphone comme une protection sociale pour éviter de faire face à la réalité parfois désagréable. \"Toutes ces applications à disposition et ces options de divertissement à portée de doigt, permettent en effet comme jamais de se couper de ses problèmes, des tensions de la vie réelle de réalité et d'éviter de s'y confronter\", constate Tayana Panova, l'auteur principal de l'étude.",
                "https://blobsvc.wort.lu/picture/7b668c1484bbe961d2eb11913b732e0a/860/484/crop/6/296/998/853/wortv3/4bca90803f409b27733d5f8ff371e564ffa040b6"));

        if(listener!=null) {
            listener.onReceiveNews(allNews);
        }
    }
}
