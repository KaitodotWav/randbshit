import customtkinter as ctk
import json, sys, os


class Creator():
    lib = []
    try:
        lib = [file for file in os.listdir("pyrev") file.endswith()]
    except:
        os.mkdir("pyrev")
    
    print(lib)
