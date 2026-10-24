# Guía de Git y GitHub – TPOO

Guía de primeros pasos (semana 1) y colaboración (semana 2).

## Parte 1. Primeros pasos con Git

### 1.1 Configuración inicial (una sola vez)

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu_correo@ejemplo.com"
git config --global init.defaultBranch main
```

### 1.2 Crear un repositorio local o clonar uno de GitHub

```bash
# Crear uno nuevo en la carpeta actual
git init

# Clonar uno existente a la máquina local
git clone https://github.com/<usuario>/<repositorio>.git
cd <repositorio>
```

### 1.3 Navegación básica por el repositorio

```bash
git status          # estado de los archivos
ls -la              # contenido de la carpeta (incluye .git)
git log --oneline   # historial resumido
```

### 1.4 Primer commit

```bash
git add archivo.txt          # agrega un archivo al área de preparación
git add .                    # agrega todos los cambios
git commit -m "Agrega archivo inicial"
```

Flujo: **working directory → `git add` → staging → `git commit` → repositorio local → `git push` → GitHub**.

### 1.5 Visualizar el historial de commits

```bash
git log
git log --oneline --graph --all
git show <hash>
git diff
```

### 1.6 Ramas (branches) y merges

```bash
git branch                       # lista ramas
git branch feature/nueva         # crea una rama
git checkout feature/nueva       # cambia de rama
git checkout -b feature/otra     # crea y cambia en un paso

# Fusionar una rama en main
git checkout main
git merge feature/nueva
git branch -d feature/nueva      # elimina la rama ya fusionada
```

## Parte 2. Fusión, conflictos y colaboración

### 2.1 Cambios en una rama y fusión con la rama principal

1. Crear la rama: `git checkout -b feature/mi-cambio`
2. Editar y hacer commit.
3. Volver a `main` y ejecutar `git merge feature/mi-cambio`.

### 2.2 Resolución de conflictos

Un conflicto aparece cuando dos ramas modifican la misma línea. Git marca el archivo así:

```
<<<<<<< HEAD
versión de la rama actual
=======
versión de la rama que se fusiona
>>>>>>> feature/otra
```

Para resolverlo:

1. Abrir el archivo y decidir qué contenido queda.
2. Borrar las marcas `<<<<<<<`, `=======` y `>>>>>>>`.
3. `git add archivo` y luego `git commit`.

Usa `git merge --abort` si quieres cancelar la fusión.

### 2.3 Colaboración en GitHub

1. **Invitar compañeros:** repositorio → *Settings* → *Collaborators* → *Add people*.
2. **Clonar el repositorio compartido:** `git clone <url>`.
3. **Actualizar tu copia local:** `git pull origin main`.

### 2.4 Pull Request

```bash
git checkout -b feature/mi-aporte
# ... editar archivos ...
git add .
git commit -m "Agrega caso de práctica de ramas"
git push -u origin feature/mi-aporte
```

Luego en GitHub: **Compare & pull request** → describir el cambio → asignar revisor → **Create pull request**.

### 2.5 Revisión de código

El revisor abre la pestaña *Files changed*, deja comentarios en las líneas y elige **Approve** o **Request changes**. Una vez aprobado, se hace **Merge pull request**. Esta revisión es parte de la evidencia que se entrega.

## Parte 3. Buenas prácticas

- Mensajes de commit en imperativo y específicos: `Corrige cálculo de total`, no `cambios`.
- Una rama por tarea, con nombres como `feature/login`, `fix/error-total`, `docs/informe`.
- Hacer `git pull` antes de empezar a trabajar.
- No subir archivos compilados ni credenciales (usar `.gitignore`).

## Comandos de referencia rápida

| Comando | Para qué sirve |
|---|---|
| `git init` | Crear repositorio local |
| `git clone <url>` | Copiar un repositorio remoto |
| `git status` | Ver estado de los archivos |
| `git add <archivo>` | Preparar cambios |
| `git commit -m "msg"` | Guardar cambios en el historial |
| `git log --oneline` | Ver historial |
| `git branch` / `git checkout` | Listar y cambiar ramas |
| `git merge <rama>` | Fusionar ramas |
| `git push` / `git pull` | Enviar y traer cambios |
