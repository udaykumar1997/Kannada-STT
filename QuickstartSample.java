// Imports the Google Cloud client library

//package com.example.speech;
//import com.google.cloud.bigquery.BigQuery;

import com.google.cloud.bigquery.BigQueryOptions;
/*import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetInfo;
*/

public class QuickstartSample {
  public static void main(String... args) throws Exception {
    // Instantiate a client. If you don't specify credentials when constructing a client, the
    // client library will look for credentials in the environment, such as the
    // GOOGLE_APPLICATION_CREDENTIALS environment variable.
    /*BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();

    // The name for the new dataset
    String datasetName = "my_new_dataset";

    // Prepares a new dataset
    Dataset dataset = null;
    DatasetInfo datasetInfo = DatasetInfo.newBuilder(datasetName).build();

    // Creates the dataset
    dataset = bigquery.create(datasetInfo);
*/
    //System.out.printf("Dataset %s created.%n", dataset.getDatasetId().getDataset());
    System.out.printf("Dataset is created");
  }
}
