package com.sbaier.tictactoe.core

import java.lang.IllegalArgumentException
import kotlin.reflect.KClass
import kotlin.test.BeforeTest
import kotlin.test.assertFailsWith
import kotlin.test.Test
import kotlin.test.assertSame

class PlayerFactoryTest
{
    private val playerName = "Peter"
    private val playerEmptyName = ""
    private lateinit var factory: PlayerFactory

    @BeforeTest
    fun setup()
    {
        factory = PlayerFactory()
    }

    @Test
    fun `Player name property equals name input`() {
        val player: Player = factory.create(playerName)
        assertSame(player.name, playerName, "The name property is not the same as the provided input")
    }

    @Test
    fun `Player name is not Empty`() {
        val message ="The Player name is not allowed to be empty."
        val function: () -> Unit = {factory.create(playerEmptyName)}
        val cl: KClass<IllegalArgumentException> = IllegalArgumentException::class
        assertFailsWith(cl, message, function)
    }
}