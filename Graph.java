public class Graph<T1, T2> {

    public ArrayList<Vertex<T1>> vertices;
    public ArrayList<Vertex<T2>> vertices1;

    public Graph() {
        vertices = new ArrayList<>();
        vertices1 = new ArrayList<>();
    }

    public void addVertex(T1 data) {
        Vertex<T1> newVertex = new Vertex<>(data);
        vertices.add(newVertex);
    }

    public void removeVertex(T1 data) {
        Vertex<T1> vertexToRemove = null;
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getData().equals(data)) {
                vertexToRemove = vertices.get(i);
                break;
            }
        }
        if (vertexToRemove != null) {
            vertices.remove(vertexToRemove);
        }
    }

    public void addVertex1(T2 data) {
        Vertex<T2> newVertex = new Vertex<>(data);
        vertices1.add(newVertex);
    }

    public void removeVertex1(T2 data) {
        Vertex<T2> vertexToRemove = null;
        for (int i = 0; i < vertices1.size(); i++) {
            if (vertices1.get(i).getData().equals(data)) {
                vertexToRemove = vertices1.get(i);
                break;
            }
        }
        if (vertexToRemove != null) {
            vertices1.remove(vertexToRemove);
        }
    }

    public void addEdge(T1 source, T2 destination) {
        Vertex<T1> sourceVertex = null;
        Vertex<T1> destinationVertex = null;
        for (int i = 0; i < vertices.size(); i++) {
            Vertex<T1> vertex = vertices.get(i);
            if (vertex.getData().equals(source)) {
                sourceVertex = vertex;
            }
            if (vertex.getData().equals(destination)) {
                destinationVertex = vertex;
            }
        }
        if (sourceVertex != null && destinationVertex != null) {
            sourceVertex.addEdge(destinationVertex);
        }
    }
    

    public ArrayList<Vertex<T1>> getVertices() {
        return vertices;
    }
   
    

    public static class Vertex<T1> {

        private T1 data;
        public ArrayList<Vertex<T1>> incomingEdges;

        public Vertex(T1 data) {
            this.data = data;
            incomingEdges = new ArrayList<>();
        }

        public T1 getData() {
            return data;
        }

        private void addEdge(Vertex<T1> source) {
            incomingEdges.add(source);
        }

      

      
    }
}