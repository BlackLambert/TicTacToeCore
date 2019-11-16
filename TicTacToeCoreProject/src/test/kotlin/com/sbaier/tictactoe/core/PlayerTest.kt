package com.sbaier.tictactoe.core

import kotlin.test.Test
import kotlin.test.assertSame

class PlayerTest {
    private val playerName = "Peter"

    @Test
    fun `Player name property equals name input`()
    {
        val player = Player(playerName);
        assertSame(player.name, playerName, "The name property is not the same as the provided input")
    }
}