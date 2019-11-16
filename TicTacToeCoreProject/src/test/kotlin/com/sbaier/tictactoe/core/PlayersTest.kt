package com.sbaier.tictactoe.core

import kotlin.test.Test
import kotlin.test.assertSame


class PlayersTest
{
    private val first = Player("Hans")
    private val second = Player("Peter")

    @Test
    fun `Players equal the provided input`()
    {
        val players = Players(first, second)
        assertSame(players.first, first)
        assertSame(players.second, second)
    }
}