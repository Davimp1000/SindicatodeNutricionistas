
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListaPaciente 
{
    
    private ArrayList<Paciente> pacientes;
    private DefaultTableModel tableModel;

    //CONSTRUTOR
    public ListaPaciente(DefaultTableModel tableModel) 
    {
        this.pacientes = new ArrayList<>();
        this.tableModel = tableModel;
    }
    
    //ADICIONA UM PACIENTE A LISTA E A TABELA
    public void adicionarPaciente(Paciente paciente)
    {
      pacientes.add(paciente);
      
      tableModel.addRow( new Object[] 
      {
       paciente.getNome(),
       paciente.getCpf(),
       paciente.getData(),
       paciente.getTelefone(),
       paciente.getJaerapaciente(),
       paciente.getConsultarealizada()
      });
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
    
    
    
}
