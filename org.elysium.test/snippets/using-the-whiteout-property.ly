% DO NOT EDIT this file manually; it is automatically
% generated from Documentation/snippets/new
% Make any changes in Documentation/snippets/new/
% and then run scripts/auxiliar/makelsr.py
%
% This file is in the public domain.
%% Note: this file works from version 2.14.0
\version "2.14.0"

\header {
%% Translation of GIT committish: 615cbf212fdaf0b220b3330da417d0c3602494f2

  texidoces = "

Se puede imprimir cualquier objeto gráfico sobre un fondo blanco para
enmascarar parte de los objetos que están por debajo.  Esto puede ser
útil para mejorar el aspecto de las colisiones en situaciones
complejas cuando no es práctico reposicionar los objetos.  Es
necesario establecer explícitamente la propiedad de capa
(@code{layer}) para controlar qué objetos resultan enmascarados por el
fondo blanco.

En este ejemplo, la colisión de la ligadura de unión con la indicación
de compás resulta mejorada enmascarando la parte de la ligadura que
cruza a la indicación de compás mediante el establecimiento de la
propiedad @code{whiteout} de @code{TimeSignature}.  Para hacer esto,
se mueve @code{TimeSignature} a una capa por encima de @code{Tie}, que
se deja en la capa predeterminada de 1, y @code{StaffSymbol} se mueve
a una capa por encima de @code{TimeSignature} de manera que no resulte
enmascarada.

"

  doctitlees = "Uso de la propiedad whiteout"

  lsrtags = "expressive-marks, editorial-annotations"
  texidoc = "
Any graphical object can be printed over a white background to
mask parts of objects that lie beneath.  This can be useful to
improve the appearance of collisions in complex situations when
repositioning objects is impractical.  It is necessary to explicitly
set the @code{layer} property to control which objects are masked
by the white background.

In this example the collision of the tie with the time signature is
improved by masking out the part of the tie that crosses the time
signature by setting the @code{whiteout} property of @code{TimeSignature}.
To do this @code{TimeSignature} is moved to a layer above @code{Tie}, which
is left in the default layer of 1, and @code{StaffSymbol} is moved to a
layer above @code{TimeSignature} so it is not masked.
"
  doctitle = "Using the whiteout property"
} % begin verbatim


{
  \override Score.StaffSymbol #'layer = #4
  \override Staff.TimeSignature #'layer = #3
  b'2 b'~
  \once \override Staff.TimeSignature #'whiteout = ##t
  \time 3/4
  b' r4
}