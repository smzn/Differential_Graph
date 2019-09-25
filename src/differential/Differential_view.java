package differential;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Differential_view extends Frame implements ActionListener,WindowListener{
	private double x_value[],r_value[],d_value[];
	
	public Differential_view(double x_value[], double r_value[], double d_value[]) {
		this.x_value = x_value;
		this.r_value = r_value;
		this.d_value = d_value;
		addWindowListener(this);
		setTitle("数値微分");
		
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		for(int i = 0; i < x_value.length; i++) {
			data.addValue(this.r_value[i], "理論値", x_value[i]+"");
			data.addValue(this.d_value[i], "数値微分", x_value[i]+"");
		}
		
	    JFreeChart chart = 
	      ChartFactory.createLineChart(
	    		  "数値微分",
	              "x",
	              "y",
	              data,
	              PlotOrientation.VERTICAL,
	              true,
	              false,
	              false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
