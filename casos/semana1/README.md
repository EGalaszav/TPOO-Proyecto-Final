# Casos – Semana 1: commits, ramas y merges

## Caso 1.1 – Primer commit
1. Crear un archivo `Saludo.java` (ver carpeta).
2. Ejecutar `git add Saludo.java` y `git commit -m "Agrega clase Saludo"`.
3. Revisar el historial con `git log --oneline`.

**Evidencia:** captura del `git log` o enlace al commit.

## Caso 1.2 – Ramas
1. Crear la rama `feature/despedida` con `git checkout -b feature/despedida`.
2. Agregar el método `despedir()` en `Saludo.java` y hacer commit.
3. Cambiar a `main` y comprobar que el método no existe.

## Caso 1.3 – Fusión
1. En `main`, ejecutar `git merge feature/despedida`.
2. Verificar con `git log --oneline --graph --all`.

**Evidencia:** captura del grafo de ramas.
