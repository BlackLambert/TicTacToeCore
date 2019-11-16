package com.sbaier.tictactoe.core

class PlayersFactory
{
    public fun create(first: Player, second: Player) : Players
    {
        if(first == second)
            throw IllegalArgumentException("Failed to create players object." +
                    "The first and the second player are the same.")
        return Players(first, second)
    }
}