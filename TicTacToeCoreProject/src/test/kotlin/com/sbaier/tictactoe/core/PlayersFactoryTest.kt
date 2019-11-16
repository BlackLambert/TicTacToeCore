package com.sbaier.tictactoe.core


import org.junit.Test
import kotlin.test.assertSame
import kotlin.test.BeforeTest
import kotlin.test.assertFailsWith

class PlayersFactoryTest {
    private lateinit var first: Player
    private lateinit var second: Player
    private lateinit var secondNameSameAsFirst: Player
    private lateinit var secondSameAsFirst: Player
    private lateinit var factory: PlayersFactory

    @BeforeTest
    fun setup()
    {
        first = Player("Hans")
        second = Player("Peter")
        secondNameSameAsFirst = Player("Hans")
        secondSameAsFirst = first;
        factory = PlayersFactory()
    }

    @Test
    fun `Players equal the provided input`()
    {
        val players = factory.create(first, second)
        assertSame(players.first, first)
        assertSame(players.second, second)
    }

    @Test
    fun `Provided player names do not equal`()
    {
        val function: () -> Unit = {factory.create(first, secondNameSameAsFirst)}
        assertFailsWith<IllegalArgumentException> ( block = function, message = "Failed to create Players. " +
                "The names of both players are the same. This is not allowed." )
    }

    @Test
    fun `Provided player do not equal`()
    {
        val function: () -> Unit = {factory.create(first, secondSameAsFirst)}
        assertFailsWith<IllegalArgumentException> ( block = function, message = "Failed to create Players. " +
                "The both the players are the same. This is not allowed." )
    }
}