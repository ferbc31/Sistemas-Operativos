import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaApplication1 {
    private JFrame marco;
    private JTextField campoEntrada;
    private JTextArea areaResultado;

    public JavaApplication1() {
        marco = new JFrame("Conversor de Bases Numéricas");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400, 300);

        campoEntrada = new JTextField(20);

        JButton aBinario = new JButton("Decimal a Binario");
        JButton aDecimalDesdeBinario = new JButton("Binario a Decimal");
        JButton aOctal = new JButton("Decimal a Octal");
        JButton aDecimalDesdeOctal = new JButton("Octal a Decimal");
        JButton aHexadecimal = new JButton("Decimal a Hexadecimal");
        JButton aDecimalDesdeHexadecimal = new JButton("Hexadecimal a Decimal");

        areaResultado = new JTextArea(10, 30);
        areaResultado.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(campoEntrada);
        panel.add(aBinario);
        panel.add(aDecimalDesdeBinario);
        panel.add(aOctal);
        panel.add(aDecimalDesdeOctal);
        panel.add(aHexadecimal);
        panel.add(aDecimalDesdeHexadecimal);
        panel.add(new JScrollPane(areaResultado));

        aBinario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int decimal = Integer.parseInt(campoEntrada.getText());
                areaResultado.setText(Integer.toBinaryString(decimal));
            }
        });

        aDecimalDesdeBinario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String binario = campoEntrada.getText();
                int decimal = Integer.parseInt(binario, 2);
                areaResultado.setText(String.valueOf(decimal));
            }
        });

        aOctal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int decimal = Integer.parseInt(campoEntrada.getText());
                areaResultado.setText(Integer.toOctalString(decimal));
            }
        });

        aDecimalDesdeOctal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String octal = campoEntrada.getText();
                int decimal = Integer.parseInt(octal, 8);
                areaResultado.setText(String.valueOf(decimal));
            }
        });

        aHexadecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int decimal = Integer.parseInt(campoEntrada.getText());
                areaResultado.setText(Integer.toHexString(decimal).toUpperCase());
            }
        });

        aDecimalDesdeHexadecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String hexadecimal = campoEntrada.getText();
                int decimal = Integer.parseInt(hexadecimal, 16);
                areaResultado.setText(String.valueOf(decimal));
            }
        });

        marco.add(panel);
        marco.setVisible(true);
    }

    public static void main(String[] args) {
        new JavaApplication1();
    }
}





/*


1. **Importaciones**:
   - `javax.swing.*`: Es un paquete que proporciona clases para crear componentes de interfaz gráfica de usuario (como botones, cuadros de texto, etc.).
   - `java.awt.event.*`: Contiene clases para procesar eventos generados por componentes Swing.

2. **Declaración de la Clase**:
   La clase se llama `JavaApplication1`.

3. **Atributos de la Clase**:
   - `JFrame marco`: Es la ventana principal de la aplicación.
   - `JTextField campoEntrada`: Un campo de texto donde el usuario introducirá valores para convertir.
   - `JTextArea areaResultado`: Una área de texto donde se mostrarán los resultados de las conversiones.

4. **Constructor de la Clase (`JavaApplication1`)**:
   
   a. Crea un nuevo `JFrame` llamado "Conversor de Bases Numéricas".
   b. Establece la operación por defecto al cerrar la ventana: la aplicación se cerrará. 
   c. Establece el tamaño de la ventana a 400x300 píxeles.
   d. Crea botones con etiquetas específicas para las diferentes conversiones. 
   e. Crea un `JPanel` (un contenedor) y agrega todos los componentes (botones, campo de texto, área de texto) a este panel.
   f. Asocia eventos de acción a cada botón. Cuando un botón es presionado, se ejecuta el código correspondiente para realizar la conversión especificada y muestra el resultado en `areaResultado`.

5. **Eventos de los Botones**:

   a. `aBinario`: Convierte un número decimal a binario. 
   b. `aDecimalDesdeBinario`: Convierte un número binario a decimal. 
   c. `aOctal`: Convierte un número decimal a octal. 
   d. `aDecimalDesdeOctal`: Convierte un número octal a decimal.  
   e. `aHexadecimal`: Convierte un número decimal a hexadecimal. 
   f. `aDecimalDesdeHexadecimal`: Convierte un número hexadecimal a decimal.

6. **Método `main`**:
   Es el punto de entrada de la aplicación. Aquí, simplemente se crea una instancia de la clase `JavaApplication1`, lo que a su vez muestra la interfaz gráfica de usuario y permite al usuario realizar conversiones de bases numéricas.

En resumen, este código es una simple aplicación gráfica en Java que permite al usuario convertir números entre diferentes bases: decimal, binario, octal y hexadecimal.
 */