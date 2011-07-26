%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.14.0"

\header {
  lsrtags = "expressive-marks, tweaks-and-overrides"

%% Translation of GIT committish: 615cbf212fdaf0b220b3330da417d0c3602494f2
  texidoces = "
El orden vertical que ocupan las inscripciones gráficas está
controlado con la propiedad @code{'script-priority}. Cuanto más
bajo es este número, más cerca de la nota se colocará. En este
ejemplo, el @code{TextScript} (el sostenido) tiene primero la
prioridad más baja, por lo que se sitúa en la posición más baja en
el primer ejemplo. En el segundo, el semitrino (el @code{Script})
es el que la tiene más baja, por lo que se sitúa en la parte
interior. Cuando dos objetos tienen la misma prioridad, el orden
en que se introducen determina cuál será el que aparece en primer
lugar.

"
  doctitlees = "Controlar la ordenación vertical de las inscripciones"


%% Translation of GIT committish: 0a868be38a775ecb1ef935b079000cebbc64de40
texidocde = "
Die vertikale Anordnung von Beschriftungen wird mit der
@code{'script-priority}-Eigenschaft kontrolliert.  Um so kleiner die
Zahl, umso näher wird die Beschriftung in Bezug auf die Note gesetzt.  In
diesem Beispiel hat das @code{TextScript}-Objekt (das Kreuz) zuerst
die niedrigste Priorität, wird also auch am niedrigsten in dem ersten
Beispiel gesetzt.  Im zweiten Fall hat der Praller (das @code{Script})
die niedrigste Priorität, darum wird er am nächsten zum System gesetzt.
Wenn zwei Objekte die gleiche Priorität haben, wird ihre Reihenfolge
anhand ihres Auftretens in der Quelldatei entschieden.

"
  doctitlede = "Die vertikale Anordnung von Beschriftungen kontrollieren"

%% Translation of GIT committish: 217cd2b9de6e783f2a5c8a42be9c70a82195ad20
  texidocfr = "
Les symboles s'ordonnent verticalement suivant la propriété
@code{script-priority}. Plus sa valeur numérique est faible, plus le
symbole sera proche de la note. Dans l'exemple suivant, l'objet
@code{TextScript} -- le dièse -- a d'abord la propriété la
plus basse, et il est donc placé plus près de la note ; ensuite c'est
l'objet @code{Script} -- le mordant -- qui a la propriété la plus basse,
et il se place alors sous le dièse.  Lorsque deux objets ont la même
priorité, c'est l'ordre dans lequel ils sont indiqués qui détermine
lequel sera placé en premier.

"
  doctitlefr = "Contrôle de l'ordre vertical des articulations et ornements"


  texidoc = "
The vertical ordering of scripts is controlled with the
@code{'script-priority} property. The lower this number, the closer it
will be put to the note. In this example, the @code{TextScript} (the
sharp symbol) first has the lowest priority, so it is put lowest in the
first example. In the second, the prall trill (the @code{Script}) has
the lowest, so it is on the inside. When two objects have the same
priority, the order in which they are entered determines which one
comes first.

"
  doctitle = "Controlling the vertical ordering of scripts"
} % begin verbatim

\relative c''' {
  \once \override TextScript #'script-priority = #-100
  a2^\prall^\markup { \sharp }

  \once \override Script #'script-priority = #-100
  a2^\prall^\markup { \sharp }
}
