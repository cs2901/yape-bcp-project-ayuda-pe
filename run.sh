#! /bin/bash
command -v nodejs >/dev/null 2>&1 || { echo >&2 "Se requiere nodejs para utilizar react. Abortando."; exit 1; }
command -v npm >/dev/null 2>&1 || { echo >&2 "Se requiere npm para construir el proyecto. Abortando."; exit 1; }
npm start --prefix ./ayudape-frontend;
