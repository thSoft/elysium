%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.17.30"

\header {
  lsrtags = "expressive-marks, text, tweaks-and-overrides"

  texidoc = "
Unlike text scripts, rehearsal marks cannot be stacked at a particular
point in a score: only one @code{RehearsalMark} object is created.
Using an invisible measure and bar line, an extra rehearsal mark can be
added, giving the appearance of two marks in the same column. This
method may also prove useful for placing rehearsal marks at both the
end of one system and the start of the following system.

"
  doctitle = "Creating simultaneous rehearsal marks"
} % begin verbatim

{
  \key a \major
  \set Score.markFormatter = #format-mark-box-letters
  \once \override Score.RehearsalMark.outside-staff-priority = #5000
  \once \override Score.RehearsalMark.self-alignment-X = #LEFT
  \once \override Score.RehearsalMark.break-align-symbols = #'(key-signature)
  \mark \markup { \bold { Senza denti } }

  % the hidden measure and bar line
  % \cadenzaOn turns off automatic calculation of bar numbers
  \cadenzaOn
  \once \omit Score.TimeSignature
  \time 1/16
  s16 \bar ""
  \cadenzaOff

  \time 4/4
  \once \override Score.RehearsalMark.self-alignment-X = #LEFT
  \mark \markup { \box \bold Intro }
  d'1
  \mark \default
  d'1
}