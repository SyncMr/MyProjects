package com.example.android.Accelerometer;

import java.util.*;



public class Matrixmap {
	
	
static	ArrayList<Integer> ai = new ArrayList<Integer>();
static	ArrayList<Integer> aj = new ArrayList<Integer>();
static boolean flag = false;


static String  a [][] =  {
        {"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w"},
        {"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"0"},
        {"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w"},
        {"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"w",	"w"},
        {"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"w",	"w",	"w",	"1",	"w",	"1",	"w",	"w",	"1",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w"},
        {"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"1",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w"},
        {"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w"},
        {"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1"},
        {"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w"},
        {"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w"},
        {"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"1",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"w",	"w",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"1",	"1",	"1",	"1",	"1",	"1",	"1",	"w",	"0",	"0",	"0",	"0",	"0",	"0"},
        {"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"0",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"w",	"0",	"0",	"0",	"0",	"0",	"0"}
       };

//public static int bluetoothi [] =  {13,9,19,26,22}; // {28,11,17,37,15 }; 
//public static int bluetoothj [] =  {2,1,3,9,7};    // {9,9,83,19,3};







public static String Matmap()
{ int i, j, x, y, k, cnt, l, idx;

String dir;
//int len = 5;


if (flag == false){
for (k=0 ; k <5; k++)
{ 
ai.add(Accelerometer.bluetoothi.get(k));
aj.add(Accelerometer.bluetoothj.get(k));
	//ai.add(bluetoothi[k]);
	//aj.add(bluetoothj[k]);
	
}
flag = true;

}

//int len = ai.size();
	
//Accelerometer.trace.clear();

/*while (Accelerometer.trace.isEmpty())
{;
} */

//Set set = Accelerometer.trace.keySet();
//Iterator itr = set.iterator();


//for (l=0 ; l < Accelerometer.stepcounts.size(); ++l );
{
	
	
	dir = (String) Accelerometer.trace.get(Accelerometer.stepcounts.get(Accelerometer.stepcounts.size()-1));
	
/*	if (len <= 1)
			{
		     return (ai.get(0)+ "  "+ aj.get(0)+ "    "+ (b++)+ "    "+ Accelerometer.trace.size() );
		
			}  */
	
	for (k=0 ; k < ai.size(); )
	{  
		
		 x = ai.get(k);
		 y = aj.get(k);
	
	if (dir =="N")
	{ --x;
	 if ((a[x][y] == "w") || (a[x][y] == "0") )
	 {
		 ai.remove(k);
		 aj.remove(k);
		// len--;
	 }
	 else
	 {
		 idx = ai.get(k);
		 ai.set(k,--idx);
		 ++k;
	 }
	 
	}
	
	else if (dir =="S")
	{ ++x;
	 if ((a[x][y] == "w") || (a[x][y] == "0") )
	 {
		 ai.remove(k);
		 aj.remove(k);
		// len--;
	 }
	 else
	 {
		 idx = ai.get(k);
		 ai.set(k,++idx);
		 ++k;
	 }
	
	 
	}
	else if (dir =="E")
	{ ++y;
	 if ((a[x][y] == "w") || (a[x][y] == "0") )
	 {
		 ai.remove(k);
		 aj.remove(k);
		// len--;
	 }
	 else
	 {
		 idx = aj.get(k);
		 aj.set(k,++idx);
		 ++k;
	 }
	 
	}
	else if (dir =="W")
	{ --y;
	 if ((a[x][y] == "w") || (a[x][y] == "0") )
	 {
		 ai.remove(k);
		 aj.remove(k);
		// len--;
	 }
	 else
	 {
		 idx = aj.get(k);
		
		 aj.set(k,--idx);
		 ++k;
	 }
	 
	}
	
	
	
	}



}
 
//return (ai.get(0)+ "  "+ aj.get(0));
//return ("error"+ "    "+ (b++));
if (ai.size() > 0)
{
	 return (ai.get(0)+ "  "+ aj.get(0)+ "    "+ Accelerometer.trace.size());
	 
}
else
	return ("error"+ "    ");

}




}

