# TP1
Objectif du TP
 Compilation et exécution d’un fichier java
 Utilisation des boucles et des instructions de contrôle
 Initiation avec les objets
 Manipulation des tableaux
Configuration logiciel
- Installer jdk (version &gt;8) -&gt; créer la variable d’environnement JAVA_HOME de valeur
Path_to_jdk -&gt; Ajouter jdk/bin à la valeur de la variable d’environnement PATH.
- Installer un Ide pour la programmation Java (netbeans, eclipse, etc.).
Partie I
- Créer un fichier texte nommé « Bonjour » et d’extension java.
- Créer une classe appelée « Bonjour » contenant une méthode main ayant comme entête public static
void main (String [] arg). Grâce au paramètre Arg, on peut passer des arguments à la méthode main au
moment de l’exécution. Au niveau du code du main, le premier argument est accessible via arg[0].
- Coder la méthode main d’une sorte à afficher une chaine de caractère passée comme argument lors de
l’exécution du programme.
- Modifier le code afin de proposer un programme qui calcule la somme de deux entiers passés comme
arguments à la fonction main. Utiliser la méthode parseInt de la classe Integer pour convertir un String
en int.
NB : La compilation d’un programme java en ligne de commande se fait par la commande « javac
non_fichier.java ». L’exécution se fait par la commande « java non_fichier ».
L’exécution d’un programme java par passage de paramètres à la méthode main se fait par la commande « java
non_fichier _arguments ». Exemple : java Bonjour bonjour la vie.

2/3

Partie II
1. Sous Netbeans, créer un projet java nommé « Hello », développer une classe Java dite « Exo1 »
contenant une méthode main() permettant de :
- Saluer une personne par son prénom, par exemple « Hello Anis ».
- Afficher aussi son poids (nombre réel en kg) et sa taille (nombre réel en mètre).

NB : Toutes les valeurs sont à lire sur la ligne de commandes comme des arguments de la méthode main().
2. Ecrire une classe Java « Exo2 » permettant d&#39;appliquer une opération arithmétique sur deux valeurs
numériques.
- L&#39;opérateur ainsi que les valeurs doivent être saisis à partir de la ligne de commandes selon le
format suivant : 

java nom_app operateur val1 val2

- Les opérateurs à considérer sont ceux de l’addition, la soustraction, la multiplication et la
division.
- Considérer ces opérateurs sous forme de caractères ou de chaines de caractères.
3. Développer une classe Java dite « Exo3 » contenant une méthode main() qui a exactement le même rôle
que celle du premier question, mais cette fois-ci, toutes les valeurs sont à lire à partir du clavier grâce à
un objet Scanner.
- Demander à l’utilisateur de saisir des informations (le prénom, le poids et la taille).
- Calculer l’indice de masse corporelle (IMC) qui estime le poids idéal en fonction de la taille.
(IMC = poids / taille²)
- Le poids est en kg et la taille est en mètre
- Afficher un message selon l’IMC trouvé :
- IMC &lt; 18,5 : insuffisance pondérale
- 18,5 &lt;= IMC &lt; 25 : poids normal
- 25 &lt;= IMC &lt; 30 : surpoids
- IMC &gt; =30 : obésité
-

NB : La récupération d’une entrée depuis le clavier se fait en sollicitant les méthodes de la classe
Scanner.

- La déclaration d’un objet Scanner se fait par l’instruction :

Scanner obj=new Scanner(System.in). La méthode à utiliser change en fonction du type de donnée à
récupérer.

- La méthode equals de la classe String est utilisée pour comparer une chaîne de caractères à une
autre.
import java.util.Scanner;

3/3

Partie III
1. Parfois, retrouver un mot de passe à partir d’une phrase clé est plus simple et plus sécurisé que retenir le
mot de passe lui-même. En effet, l’une des techniques de génération de mots de passe est la technique de
la phrase clé dont le principe est le suivant :
 Choisir un proverbe, un titre de film, de chanson ou de livre, etc. Cette phrase servira comme
clé pour la génération du mot de passe.
 Le mot de passe se déduit de la phrase clé par une méthode au choix.

La méthode choisie dans notre cas est la suivante : générer le mot de passe en extrayant les premières lettres des
mots constituant la phrase, puis en leur concaténant les longueurs de ces mots.

 A titre d’exemples : « La vie en rose » donne le mot de passe suivant : « Lver2324 »
 « The Java Programming Language » donne le mot de passe suivant : « TJPL34118 »
Ecrire une classe « Phrase » qui, en lisant une phrase clé, génère un mot de passe en utilisant la méthode
susmentionnée.
NB : Utiliser la méthode prédéfinie « split » pour décomposer la phrase en chaines de caractères. Elle retourne
un tableau composé des chaines contenues dans cette phrase.

2. Ecrire une classe Java « Exo7 » permettant de remplir un tableau de chaines de caractères, dont la taille
est à saisir par l’utilisateur.
Puis, une fois rempli, il doit le parcourir, vérifier la présence de chaines palindromes et créer un autre tableau de
booléens qui reflète exactement le contenu du premier tableau.
Par exemple, si le premier tableau est comme suit :
exercice java radar salut elle

Le deuxième tableau sera :
false false true false true
