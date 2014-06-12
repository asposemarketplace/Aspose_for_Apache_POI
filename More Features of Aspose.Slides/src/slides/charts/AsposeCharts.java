/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
 *
 * @author  Shoaib Khan <shoaib.khan@aspose.com>
 * @link    https://github.com/asposemarketplace/Aspose_for_Apache_POI
 */

package slides.charts;

import com.aspose.slides.ChartDataCellFactory;
import com.aspose.slides.ChartEx;
import com.aspose.slides.ChartSeriesEx;
import com.aspose.slides.ChartTypeEx;
import com.aspose.slides.DataLabelEx;
import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideEx;

public class AsposeCharts
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate PresentationEx class that represents PPTX file
		PresentationEx pres = new PresentationEx();
		
		//Access first slide
		SlideEx sld = pres.getSlides().get_Item(0);
		
		// Add chart with default data
		ChartEx chart = sld.getShapes().addChart(ChartTypeEx.ClusteredColumn, 0, 0, 500, 500);
		
		//Setting chart Title
		chart.getChartTitle().getText().setText("Sample Title");
		chart.getChartTitle().getText().setCenterText(true);
		chart.getChartTitle().setHeight(20f);
		chart.hasTitle(true);
		
		//Set first series to Show Values
		chart.getChartData().getSeries().get_Item(0).getLabels().setShowValue(true);
		
		//Setting the index of chart data sheet
		int defaultWorksheetIndex = 0;
		
		//Getting the chart data worksheet
		ChartDataCellFactory fact = chart.getChartData().getChartDataCellFactory();
		
		//Delete default generated series and categories
		chart.getChartData().getSeries().clear();
		chart.getChartData().getCategories().clear();
		
		//Adding new series
		chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 1, "Series 1"), chart.getType());
		chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 2, "Series 2"), chart.getType());
		
		//Adding new categories
		chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 1, 0, "Caetegoty 1"));
		chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 2, 0, "Caetegoty 2"));
		chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 3, 0, "Caetegoty 3"));
		
		//Take first chart series
		ChartSeriesEx series = chart.getChartData().getSeries().get_Item(0);
		
		//Now populating series data
		series.getValues().add(fact.getCell(defaultWorksheetIndex, 1, 1, 20));
		series.getValues().add(fact.getCell(defaultWorksheetIndex, 2, 1, 50));
		series.getValues().add(fact.getCell(defaultWorksheetIndex, 3, 1, 30));
		
		//Take second chart series
		series = chart.getChartData().getSeries().get_Item(1);
		
		//Now populating series data
		series.getValues().add(fact.getCell(defaultWorksheetIndex, 1, 2, 30));
		series.getValues().add(fact.getCell(defaultWorksheetIndex, 2, 2, 10));
		series.getValues().add(fact.getCell(defaultWorksheetIndex, 3, 2, 60));
		
		//create custom lables for each of categories for new series
		
		//first label will be show Category name
		DataLabelEx lbl = new DataLabelEx(series);
		lbl.setShowCategoryName( true);
		lbl.setId (0);
		series.getLabels().add(lbl);
		
		//Show series name for second label
		lbl = new DataLabelEx(series);
		lbl.setShowSeriesName(true);
		lbl.setId(1);
		series.getLabels().add(lbl);
		
		//show value for third label
		lbl = new DataLabelEx(series);
		lbl.setShowValue(true);
		lbl.setShowSeriesName(true);
		lbl.setSeparator("/");
		lbl.setId( 2);
		series.getLabels().add(lbl);
		
		// show value and custom text
		lbl = new DataLabelEx(series);
		lbl.getTextFrame().setText( "My text");
		lbl.setId( 3);
		series.getLabels().add(lbl);

        // Save presentation with chart
        pres.write("data/AsposeChart.pptx");
	}
}
