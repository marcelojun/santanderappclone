package com.xibongu.santander.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xibongu.santander.data.Conta
import com.xibongu.santander.data.local.FakeData

class MainViewModel : ViewModel(){

    private val mutableLiveData:MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente():LiveData<Conta>{
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData;
    }

}