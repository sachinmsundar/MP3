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

import org.apache.hadoop.hbase.util.Bytes;

public class TablePartA{
   public static void main(String[] args) throws IOException {

	  //TODO
      Configuration config = HBaseConfiguration.create();
      HBaseAdmin admin = new HBaseAdmin(config);
      HTableDescriptor td1 = new HTableDescriptor(TableName.valueOf("powers"));
      HTableDescriptor td2 = new HTableDescriptor(TableName.valueOf("food"));

      //column families for table - powers
      td1.addFamily(new HColumnDescriptor("personal"));
      td1.addFamily(new HColumnDescriptor("professional"));
      td1.addFamily(new HColumnDescriptor("custom"));

      //column families for table - food
      td2.addFamily(new HColumnDescriptor("nutrition"));
      td2.addFamily(new HColumnDescriptor("taste"));

      admin.createTable(td1);
      //System.out.println(" Table - powers created ");

      admin.createTable(td2);
      //System.out.println(" Table - food created ");

	
   }
}

