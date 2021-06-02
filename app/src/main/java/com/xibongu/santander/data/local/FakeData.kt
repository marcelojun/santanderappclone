package com.xibongu.santander.data.local

import com.xibongu.santander.data.Cartao
import com.xibongu.santander.data.Cliente
import com.xibongu.santander.data.Conta

class FakeData{


    fun getLocalData(): Conta {
        val cliente = Cliente("João da Silva")
        val cartao = Cartao("7325481231")

        return Conta(
            "159874-1", "228", "12849,25", "10000,00",
            cliente, cartao);

    }
}