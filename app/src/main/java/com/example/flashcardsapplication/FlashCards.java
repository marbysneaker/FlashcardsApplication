package com.example.flashcardsapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class FlashCards extends AppCompatActivity implements SelectListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_cards);

        RecyclerView list = findViewById(R.id.recycle_views_cards);


        Project[] projects = {

                new Project("Security","AWS provides a wide range of security services to help customers secure their applications, data, and infrastructure in the cloud. click for more...",R.drawable.security,R.id.question_one),
                new Project("Storage","Amazon Web Services (AWS) provides a range of storage services designed to meet the needs of different types of data and workloads. click for more...",R.drawable.servers,R.id.question_two),
                new Project("Programming","AWS provides a variety of coding services to help developers build and deploy applications quickly and easily. click for more...",R.drawable.coding,R.id.question_three),
                new Project("Migration","AWS provides a range of migration services to help businesses migrate their applications and data to the cloud. click for more...",R.drawable.migration,R.id.question_four),
                new Project("AI/ Machine Learning","AWS AWS provides a suite of AI/ML services including Amazon SageMaker, Rekognition, Comprehend, Transcribe, Polly, and Lex.",R.drawable.ai,R.id.question_five)
        };

        ProjectsAdapter projectAdapter = new ProjectsAdapter(projects, this);

        list.setAdapter(projectAdapter);








//        question_two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
//                Bundle bundle = new Bundle();
//                String answer = "6";
//                bundle.putString("answer",answer);
//                answersActivityIntent.putExtras(bundle);
//                startActivity(answersActivityIntent);
//            }
//        });
//        question_three.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
//                Bundle bundle = new Bundle();
//                String answer = "9";
//                bundle.putString("answer",answer);
//                answersActivityIntent.putExtras(bundle);
//                startActivity(answersActivityIntent);
//            }
//        });
//        question_four.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
//                Bundle bundle = new Bundle();
//                String answer = "3";
//                bundle.putString("answer",answer);
//                answersActivityIntent.putExtras(bundle);
//                startActivity(answersActivityIntent);
//            }
//        });
//        question_five.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
//                Bundle bundle = new Bundle();
//                String answer = "10";
//                bundle.putString("answer",answer);
//                answersActivityIntent.putExtras(bundle);
//                startActivity(answersActivityIntent);
//            }
//        });
//


    }


    @Override
    public void onItemClicked(int position) {

        Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
        Bundle bundle = new Bundle();
        Bundle topic = new Bundle();
        String security = "These services include identity and access management (IAM), which allows customers to manage user identities and permissions; network security services such as virtual private cloud (VPC) and security groups; encryption services like AWS Key Management Service (KMS) and AWS Certificate Manager (ACM); and monitoring and logging services such as Amazon CloudWatch and AWS CloudTrail. Additionally, AWS offers compliance certifications and attestations for various standards such as HIPAA, PCI DSS, and SOC. With these security services, customers can benefit from a secure and compliant cloud environment while also being able to customize their security controls to meet their specific requirements.";
        String storage = "These services include object storage (Amazon S3), file storage (Amazon EFS), block storage (Amazon EBS), and archival storage (Amazon Glacier). Amazon S3 is a highly scalable and durable storage service designed for large-scale data storage and retrieval, while Amazon EFS provides shared file storage for use with AWS compute instances. Amazon EBS is block-level storage that provides persistent storage volumes for use with EC2 instances. Finally, Amazon Glacier is a low-cost, secure storage service designed for long-term archival of data that is rarely accessed. Together, these storage services provide a range of options for storing and managing data on the AWS cloud.";
        String programming ="These services include AWS Lambda, AWS Elastic Beanstalk, Amazon API Gateway, and AWS CloudFormation. AWS Lambda is a serverless compute service that enables developers to run code in response to events without the need for managing servers. AWS Elastic Beanstalk provides a platform for deploying and scaling web applications, while Amazon API Gateway enables developers to create and manage APIs for their applications. Finally, AWS CloudFormation is a service that allows developers to deploy and manage infrastructure as code. Together, these services provide developers with the tools they need to build and deploy applications on the AWS cloud, with minimal infrastructure management overhead.";
        String migration = "These services include AWS Database Migration Service (DMS), AWS Server Migration Service (SMS), and AWS Application Discovery Service. AWS DMS simplifies the process of migrating databases to AWS, while AWS SMS enables businesses to migrate on-premises virtual machines to AWS. AWS Application Discovery Service helps businesses identify their existing on-premises applications and dependencies, making it easier to plan and execute migrations. Additionally, AWS also provides a range of consulting and support services to help businesses plan and execute successful migrations to the cloud. By leveraging these services, businesses can reduce the time, cost, and complexity of migrating their applications and data to AWS.";
        String ai ="These services enable businesses to build, train, and deploy ML models, perform image and video analysis, natural language processing, speech-to-text and text-to-speech, and build conversational interfaces for chatbots and voice assistants. AWS also offers pre-trained models and AI services for personalized recommendations and demand forecasting. These services make it easier for businesses to leverage AI/ML capabilities to drive innovation and improve customer experiences.";

        switch (position){
            case 0:
                bundle.putString("answer",security);
                bundle.putString("topic", "Security");
                break;
            case 1:
                bundle.putString("answer",storage);
                bundle.putString("topic", "Storage");
                break;
            case 2:
                bundle.putString("answer",programming);
                bundle.putString("topic", "Programming");
                break;
            case 3:
                bundle.putString("answer",migration);
                bundle.putString("topic", "Migration");
                break;
            case 4:
                bundle.putString("answer",ai);
                bundle.putString("topic", "AI/ Machine Learning");
                break;
            default:
                break;
        }


        answersActivityIntent.putExtras(bundle);
        answersActivityIntent.putExtras(topic);
        startActivity(answersActivityIntent);

//        Toast.makeText(FlashCards.this,"working" + position,Toast.LENGTH_LONG).show();
    }
}