% DO NOT EDIT this file manually; it is automatically
% generated from Documentation/snippets/new
% Make any changes in Documentation/snippets/new/
% and then run scripts/auxiliar/makelsr.py
%
% This file is in the public domain.
%% Note: this file works from version 2.16.0
\version "2.16.0"

\header {
  lsrtags = "editorial-annotations, fretted-strings"

  texidoc = "
Hammer-on and pull-off can be obtained using slurs.

"
  doctitle = "Hammer on and pull off"
} % begin verbatim


\new TabStaff {
  \relative c' {
    d4( e\2)
    a( g)
  }
}
