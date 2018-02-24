cd org.elysium.parent
mvn integration-test -Dlilypond.path=$(readlink "$(which lilypond)")
