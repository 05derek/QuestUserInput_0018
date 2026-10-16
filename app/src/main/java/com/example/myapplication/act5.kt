package com.example.myapplication

@composable
fun FormDataDiri(modifer: Modifier){
    var textNama by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value="")}
    var textJK by remember {mutableStateOf(value="")}
}