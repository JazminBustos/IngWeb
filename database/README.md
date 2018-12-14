# Sistema de Administracion Inmboliaria del Siglo 21 (SAI21)

![SAI21 Logo](https://i.gyazo.com/120b67afc8cad5051376ee702ffb039c.png)
[Google Drive](https://drive.google.com/drive/u/1/folders/0B3SCRfaCz7W9aVV2VkZiOE13b0E)

## Cambiar Icono y Ubicacion
```java
public LogIn() {
    initComponents();
    start();
}

private void start() {
    this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/HouseLogo.png")).getImage());
    this.setLocationRelativeTo(null);
}
```

## Codificar Entradas de Botones 
```java
private void textoContrasenaKeyPressed(java.awt.event.KeyEvent evt) {                                           
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    botonIngresarActionPerformed(null);
}
```

## Titulos (JFrame title)
* SAI21
* Sistema de Administracion Inmobiliaria

## Colores (JFrame - jPanel)
* Color de Fondo Oscuro: [72,72,136]
* Color de Boton: [153,153,255]

## Tamaños Botones (jPanel)
* Boton Chico: [120, 20]
* Boton Grande: [126, 50]

## Tamaños
* JFrame - Undecorated: Checked
* JPanel - Bevel Border: All Black
* JFrame - AlwaysOnTop: Unchecked
* JFrame - Resizable: Unchecked
* jPanel - PHorizional Resizable: Unchecked
* jPanel - Vertical Resizable: Unchecked

# MySQL Database Dump
```text
cd C:\Program Files\MySQL\MySQL Server 5.7\bin
mysqldump.exe -u root -p sai21 > "M:\2 - Facultad\Ingenieria Web 1\! Final\1 Proyectos\SAI21\database\SAI21_data.sql"
```

# Traducciones

## Clases
* Inquilino - Tenant
* Recibo - Receipt
* Usuario - User
* Contrato  - Contract
* Garante - Guarantor
* Administrador - Admin
* Propiedad - Propiety
* Servicio - Service
* Empresa - Enterprise
* Propietario - Owner
