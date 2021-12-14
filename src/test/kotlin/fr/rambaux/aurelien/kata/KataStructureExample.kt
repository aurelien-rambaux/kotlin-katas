package fr.rambaux.aurelien.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KataStructureExample {

    class Tests {
        @Test
        fun `should fail because it is an empty example`() {
            assertThat(Kata().theTruthIsTrue()).isTrue
        }
    }

    class Kata {
        fun theTruthIsTrue() = false
    }

}