package com.example.assasiencreed_libarie.data

import com.example.assasiencreed_libarie.R
import com.example.assasiencreed_libarie.data.model.Category
import com.example.assasiencreed_libarie.data.model.Game

class Datasource {

    fun getGames(): List<Category>{
        return listOf(
            Category(
                "Action",
                listOf(
                    Game(
                        "Assassin's Creed",
                        R.drawable.ac1,
                        2007
                    ),
                    Game(
                        "Assassin's Creed 2",
                        R.drawable.acii,
                        2009
                    ),
                    Game(
                    "Assassin's Creed Brotherhood",
                    R.drawable.acb,
                    2010
                    ),
                    Game(
                            "Assassin's Creed Revelations",
                        R.drawable.acr,
                    2011
                ),
                    Game(
                        "Assassin's Creed 3",
                        R.drawable.ac3,
                        2012
                    ),
                    Game(
                        "Assassin's Creed Creed 3 Liberation",
                        R.drawable.aclib,
                        2012
                    ),
                    Game(
                        "Assassin's Creed Blak Flag",
                        R.drawable.acbf,
                        2013
                    ),
                    Game(
                        "Assassin's Creed Roge",
                        R.drawable.acr,
                        2014
                    ),
                    Game(
                        "Assassin's Creed Unity",
                        R.drawable.acuni,
                        2014
                    ),
                    Game(
                        "Assassin's Creed Chronicles Pack (Erscheinung 2015/16)",
                        R.drawable.accro,
                        2015
                    ),
                    Game(
                        "Assassin's Creed Syndicate",
                        R.drawable.acs,
                        2015
                    ),
                    Game(
                        "Assassin's Creed Origins",
                        R.drawable.acorg,
                        2017
                    ),
                    Game(
                        "Assassin's Creed Odyssey",
                        R.drawable.acody,
                        2018
                    ),
                    Game(
                        "Assassin's Creed Valhalla",
                        R.drawable.acv,
                        2020
                    ),
                    Game(
                        "Assassin's Creed Mirage",
                        R.drawable.acm,
                        2023
                    )
                )
            ),
            Category(
                "Adventure",
                listOf(
                    Game(
                        "Grow",
                        R.drawable.adventure1,
                        2021
                    ),
                    Game(
                        "Horizon Zero Down",
                        R.drawable.adventure2,
                        2017
                    ),
                    Game(
                        "Steampunk-Assassin",
                        R.drawable.adventure3,
                        2010,
                    )
                )
            ),
            Category(
                "Simulation",
                listOf(
                    Game(
                        "Driver Licence",
                        R.drawable.sim1,
                        2014,
                    ),
                    Game(
                        "Goat Simulator",
                        R.drawable.sim2,
                        2014,
                    ),
                    Game(
                        "Harvest Moon",
                        R.drawable.sim3,
                        1996,
                    ),
                    Game(
                        "SIM's ",
                        R.drawable.sim4,
                        2014,
                    )
                )
            )
        )
    }
}