package com.sbaier.tictactoe.core

class PlayerFactory
{
    public fun create(name: String): Player
    {
        if(name.isEmpty())
            throw IllegalArgumentException("Failed to create Player. Empty name provided. This is not allowed.")
        return Player(name)
    }
}