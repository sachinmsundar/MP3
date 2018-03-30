import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;

import org.apache.hadoop.hbase.TableName;

import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Get;


import org.apache.hadoop.hbase.util.Bytes;

public class TablePartD{

   public static void main(String[] args) throws IOException {

	   //TODO
       Configuration config = HBaseConfiguration.create();
       HTable table = new HTable(config, "powers");

       Get g1 = new Get(Bytes.toBytes("row1"));
       Get g2 = new Get(Bytes.toBytes("row19"));

       Result r1 = table.get(g1);
       Result r2 = table.get(g2);

       // values for row1
       byte [] hero_1 = r1.getValue(Bytes.toBytes("personal"),Bytes.toBytes("hero"));
       byte [] power_1 = r1.getValue(Bytes.toBytes("personal"),Bytes.toBytes("power"));
       byte [] name_1 = r1.getValue(Bytes.toBytes("professional"),Bytes.toBytes("name"));
       byte [] xp_1 = r1.getValue(Bytes.toBytes("professional"),Bytes.toBytes("xp"));
       byte [] color_1 = r1.getValue(Bytes.toBytes("custom"),Bytes.toBytes("color"));

       // values for row19
       byte [] hero_2 = r1.getValue(Bytes.toBytes("personal"),Bytes.toBytes("hero"));
       byte [] color_2 = r1.getValue(Bytes.toBytes("custom"),Bytes.toBytes("color"));

       System.out.println("hero: " + Bytes.toString(hero_1) + ", " + "power: " + Bytes.toString(hero_1) + ", " +
               "name: " + Bytes.toString(name_1) + ", " + "xp: " + Bytes.toString(xp_1) + ", " + "color: " + Bytes.toString(color_1));
       System.out.println("hero: " + Bytes.toString(hero_2) + ", " + "color: " + Bytes.toString(color_2));
       System.out.println("hero: " + Bytes.toString(hero_1) + ", " + "name: " + Bytes.toString(name_1) + ", " +
               "color: " + Bytes.toString(color_1));
   }
}

